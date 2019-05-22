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
import za.ca.cput.assignment5kaylin.domain.churchPersons.FrailGoer;
import za.ca.cput.assignment5kaylin.factory.churchPersons.FrailGoerFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FrailGoerControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/frailGoer";

    @Test
    public void l_create()
    {
        FrailGoer cl = FrailGoerFactory.getFrailP("1", "old");
        ResponseEntity<FrailGoer> response = restTempl.postForEntity(url + "/create", cl, FrailGoer.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getFrailNum() + " " + response.getBody().getFrailNum());
    }

    @Test
    public void m_read()
    {
        FrailGoer c  = restTempl.getForObject(url + "/read/1", FrailGoer.class);
        assertNotNull(c);
        System.out.println(c.getFrailNum() + " " + c.getType());
    }

    @Test
    public void n_update()
    {
        String id = "1";
        FrailGoer c  = restTempl.getForObject(url + "/read/" + id, FrailGoer.class);

        restTempl.put(url + "/update/" + id, c);
        FrailGoer update = restTempl.getForObject(url + "/read/" + id, FrailGoer.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getFrailNum() + " " + update.getType());

    }

    @Test
    public void o_delete()
    {
        String id = "1";
        FrailGoer c  = restTempl.getForObject(url + "/read/" + id, FrailGoer.class);
        assertEquals(id, c.getFrailNum());
        System.out.println(c.getFrailNum() + c.getType());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, FrailGoer.class);

        assertNotSame(id, c.getFrailNum());

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
