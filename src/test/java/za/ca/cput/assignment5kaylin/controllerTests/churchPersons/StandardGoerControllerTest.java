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
import za.ca.cput.assignment5kaylin.domain.churchPersons.StandardGoer;
import za.ca.cput.assignment5kaylin.factory.churchPersons.StandardGoerFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StandardGoerControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/standardGoer";

    @Test
    public void l_create()
    {
        StandardGoer cl = StandardGoerFactory.getIsPledger("yes");
        ResponseEntity<StandardGoer> response = restTempl.postForEntity(url + "/create", cl, StandardGoer.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getPledger());
    }

    @Test
    public void m_read()
    {
        StandardGoer c  = restTempl.getForObject(url + "/read/yes", StandardGoer.class);
        assertNotNull(c);
        System.out.println(c.getPledger());
    }

    @Test
    public void n_update()
    {
        String id = "yes";
        StandardGoer c  = restTempl.getForObject(url + "/read/" + id, StandardGoer.class);

        restTempl.put(url + "/update/" + id, c);
        StandardGoer update = restTempl.getForObject(url + "/read/" + id, StandardGoer.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getPledger());

    }

    @Test
    public void o_delete()
    {
        String id = "yes";
        StandardGoer c  = restTempl.getForObject(url + "/read/" + id, StandardGoer.class);
        assertNotNull(c);
        System.out.println(c.getPledger());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, StandardGoer.class);

        //assertNotSame(id, c.getPledger());

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
