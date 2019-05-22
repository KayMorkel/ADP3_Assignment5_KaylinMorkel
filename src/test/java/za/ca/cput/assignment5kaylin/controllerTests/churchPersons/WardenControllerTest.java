package za.ca.cput.assignment5kaylin.controllerTests.churchPersons;

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
import za.ca.cput.assignment5kaylin.domain.churchPersons.Warden;
import za.ca.cput.assignment5kaylin.factory.churchPersons.WardenFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WardenControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/warden";

    @Test
    public void l_create()
    {
        Warden cl = WardenFactory.getWarden("Earle", "021 450 1754");
        ResponseEntity<Warden> response = restTempl.postForEntity(url + "/create", cl, Warden.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getWardenName() + " " + response.getBody().getWardenTelNumber());
    }

    @Test
    public void m_read()
    {
        Warden c  = restTempl.getForObject(url + "/read/Earle", Warden.class);
        assertNotNull(c);
        System.out.println(c.getWardenName() + " " + c.getWardenTelNumber());
    }

    @Test
    public void n_update()
    {
        String id = "Earle";
        Warden c  = restTempl.getForObject(url + "/read/" + id, Warden.class);

        restTempl.put(url + "/update/" + id, c);
        Warden update = restTempl.getForObject(url + "/read/" + id, Warden.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getWardenName() + " " + update.getWardenTelNumber());

    }

    @Test
    public void o_delete()
    {
        String id = "Earle";
        Warden c  = restTempl.getForObject(url + "/read/" + id, Warden.class);
        assertNotNull(c);
        System.out.println(c.getWardenName() + c.getWardenTelNumber());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, Warden.class);

        //assertNull(id, c.getWardenName());

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
