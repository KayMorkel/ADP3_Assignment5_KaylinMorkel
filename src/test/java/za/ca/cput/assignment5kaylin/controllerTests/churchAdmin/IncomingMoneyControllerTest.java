package za.ca.cput.assignment5kaylin.controllerTests.churchAdmin;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.IncomingMoney;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.IncomingMoneyFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IncomingMoneyControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/incomingMoney";

    @Test
    public void l_create()
    {
        IncomingMoney cl = IncomingMoneyFactory.getIncMon("1", "family day");
        ResponseEntity<IncomingMoney> response = restTempl.postForEntity(url + "/create", cl, IncomingMoney.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getId() + " " + response.getBody().getFrom());
    }

    @Test
    public void m_read()
    {
        IncomingMoney c  = restTempl.getForObject(url + "/read/1", IncomingMoney.class);
        assertNotNull(c);
        System.out.println(c.getId() + " " + c.getFrom());
    }

    @Test
    public void n_update()
    {
        String id = "1";
        IncomingMoney c  = restTempl.getForObject(url + "/read/" + id, IncomingMoney.class);

        restTempl.put(url + "/update/" + id, c);
        IncomingMoney update = restTempl.getForObject(url + "/read/" + id, IncomingMoney.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getId() + " " + update.getFrom());

    }

    @Test
    public void o_delete()
    {
        String id = "1";
        IncomingMoney c  = restTempl.getForObject(url + "/read/" + id, IncomingMoney.class);
        assertEquals(id, c.getId());
        System.out.println(c.getId() + c.getFrom());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, IncomingMoney.class);

        assertNotSame(id, c.getId());

        /*try
        {

        }
        catch (HttpClientErrorException hcee){
            assertEquals(hcee.getStatusCode(), HttpStatus.NOT_FOUND);
        }*/
    }

    @Test
    public void p_getAll()
    {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity respoEnt = restTempl.exchange(url + "/getAll", HttpMethod.GET, entity, String.class);
        assertNotSame(null, respoEnt.getBody());
        //System.out.println(respoEnt);
    }
}
