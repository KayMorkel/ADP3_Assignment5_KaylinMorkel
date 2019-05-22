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
import za.ca.cput.assignment5kaylin.domain.churchPersons.Priest;
import za.ca.cput.assignment5kaylin.factory.churchPersons.PriestFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PriestControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/priest";

    @Test
    public void l_create()
    {
        Priest cl = PriestFactory.getPriest("1000", "21 May 2000");
        ResponseEntity<Priest> response = restTempl.postForEntity(url + "/create", cl, Priest.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getSal() + " " + response.getBody().getInductDate());
    }

    @Test
    public void m_read()
    {
        Priest c  = restTempl.getForObject(url + "/read/1000", Priest.class);
        assertNotNull(c);
        System.out.println(c.getSal() + " " + c.getInductDate());
    }

    @Test
    public void n_update()
    {
        String id = "1000";
        Priest c  = restTempl.getForObject(url + "/read/" + id, Priest.class);

        restTempl.put(url + "/update/" + id, c);
        Priest update = restTempl.getForObject(url + "/read/" + id, Priest.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getSal() + " " + update.getInductDate());

    }

    @Test
    public void o_delete()
    {
        String id = "1000";
        Priest c  = restTempl.getForObject(url + "/read/" + id, Priest.class);
        assertEquals(id, c.getSal());
        System.out.println(c.getSal() + c.getInductDate());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, Priest.class);

        assertNotSame(id, c.getSal());

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
