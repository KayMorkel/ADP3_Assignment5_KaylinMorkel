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
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Pledge;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.PledgeFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PledgeControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/pledge";

    @Test
    public void l_create()
    {
        Pledge cl = PledgeFactory.getPledge("12", "eft");
        ResponseEntity<Pledge> response = restTempl.postForEntity(url + "/create", cl, Pledge.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getPledgeNum() + " " + response.getBody().getPaymentType());
    }

    @Test
    public void m_read()
    {
        Pledge c  = restTempl.getForObject(url + "/read/12", Pledge.class);
        assertNotNull(c);
        System.out.println(c.getPledgeNum() + " " + c.getPaymentType());
    }

    @Test
    public void n_update()
    {
        String id = "12";
        Pledge c  = restTempl.getForObject(url + "/read/" + id, Pledge.class);

        restTempl.put(url + "/update/" + id, c);
        Pledge update = restTempl.getForObject(url + "/read/" + id, Pledge.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getPledgeNum() + " " + update.getPaymentType());

    }

    @Test
    public void o_delete()
    {
        String id = "12";
        Pledge c  = restTempl.getForObject(url + "/read/" + id, Pledge.class);
        assertEquals(id, c.getPledgeNum());
        System.out.println(c.getPledgeNum() + c.getPaymentType());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, Pledge.class);

        assertNotSame(id, c.getPledgeNum());

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
