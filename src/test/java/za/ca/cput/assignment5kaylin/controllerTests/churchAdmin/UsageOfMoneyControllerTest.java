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
import za.ca.cput.assignment5kaylin.domain.churchAdmin.UsageOfMoney;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.UsageOfMoneyFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UsageOfMoneyControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/usageOfMoney";

    @Test
    public void l_create()
    {
        UsageOfMoney cl = UsageOfMoneyFactory.getUsage("12", "repairs");
        ResponseEntity<UsageOfMoney> response = restTempl.postForEntity(url + "/create", cl, UsageOfMoney.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getId() + " " + response.getBody().getUsedFor());
    }

    @Test
    public void m_read()
    {
        UsageOfMoney c  = restTempl.getForObject(url + "/read/12", UsageOfMoney.class);
        assertNotNull(c);
        System.out.println(c.getId() + " " + c.getUsedFor());
    }

    @Test
    public void n_update()
    {
        String id = "12";
        UsageOfMoney c  = restTempl.getForObject(url + "/read/" + id, UsageOfMoney.class);

        restTempl.put(url + "/update/" + id, c);
        UsageOfMoney update = restTempl.getForObject(url + "/read/" + id, UsageOfMoney.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getId() + " " + update.getUsedFor());

    }

    @Test
    public void o_delete()
    {
        String id = "12";
        UsageOfMoney c  = restTempl.getForObject(url + "/read/" + id, UsageOfMoney.class);
        assertEquals(id, c.getId());
        System.out.println(c.getId() + c.getUsedFor());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, UsageOfMoney.class);

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
