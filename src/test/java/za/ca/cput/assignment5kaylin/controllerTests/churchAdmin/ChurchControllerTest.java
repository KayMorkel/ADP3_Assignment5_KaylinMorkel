package za.ca.cput.assignment5kaylin.controllerTests.churchAdmin;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Church;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Student;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.ChurchFactory;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ChurchControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/church";

    @Test
    public void l_create()
    {
        Church cl = ChurchFactory.getChurch("Ang12", "21 Adderley Road, 5698");
        ResponseEntity<Church> response = restTempl.postForEntity(url + "/create", cl, Church.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getChurchId() + " " + response.getBody().getAddress());
    }

    @Test
    public void m_read()
    {
        Church c  = restTempl.getForObject(url + "/read/Ang12", Church.class);
        assertNotNull(c);
        System.out.println(c.getChurchId() + " " + c.getAddress());
    }

    @Test
    public void n_update()
    {
        String id = "Ang12";
        Church c  = restTempl.getForObject(url + "/read/" + id, Church.class);

        restTempl.put(url + "/update/" + id, c);
        Church update = restTempl.getForObject(url + "/read/" + id, Church.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getChurchId() + " " + update.getAddress());

    }

    @Test
    public void o_delete()
    {
        String id = "Ang12";
        Church c  = restTempl.getForObject(url + "/read/" + id, Church.class);
        assertEquals(id, c.getChurchId());
        System.out.println(c.getChurchId() + c.getAddress());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, Church.class);

        assertNotSame(id, c.getChurchId());

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
