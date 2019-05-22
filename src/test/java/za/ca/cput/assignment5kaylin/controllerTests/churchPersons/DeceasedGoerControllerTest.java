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
import za.ca.cput.assignment5kaylin.domain.churchPersons.DeceasedGoer;
import za.ca.cput.assignment5kaylin.factory.churchPersons.DeceasedGoerFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DeceasedGoerControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/deceasedGoer";

    @Test
    public void l_create()
    {
        DeceasedGoer cl = DeceasedGoerFactory.getDeceased("1", "1989");
        ResponseEntity<DeceasedGoer> response = restTempl.postForEntity(url + "/create", cl, DeceasedGoer.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getDecNum() + " " + response.getBody().getYearDied());
    }

    @Test
    public void m_read()
    {
        DeceasedGoer c  = restTempl.getForObject(url + "/read/1", DeceasedGoer.class);
        assertNotNull(c);
        System.out.println(c.getDecNum() + " " + c.getYearDied());
    }

    @Test
    public void n_update()
    {
        String id = "1";
        DeceasedGoer c  = restTempl.getForObject(url + "/read/" + id, DeceasedGoer.class);

        restTempl.put(url + "/update/" + id, c);
        DeceasedGoer update = restTempl.getForObject(url + "/read/" + id, DeceasedGoer.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getDecNum() + " " + update.getYearDied());

    }

    @Test
    public void o_delete()
    {
        String id = "1";
        DeceasedGoer c  = restTempl.getForObject(url + "/read/" + id, DeceasedGoer.class);
        assertEquals(id, c.getDecNum());
        System.out.println(c.getDecNum() + c.getYearDied());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, DeceasedGoer.class);

        assertNotSame(id, c.getDecNum());

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
