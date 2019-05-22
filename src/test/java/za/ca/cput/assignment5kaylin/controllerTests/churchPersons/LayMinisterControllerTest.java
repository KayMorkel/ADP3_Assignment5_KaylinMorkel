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
import za.ca.cput.assignment5kaylin.domain.churchPersons.LayMinister;
import za.ca.cput.assignment5kaylin.factory.churchPersons.LayMinisterFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LayMinisterControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/layMinister";

    @Test
    public void l_create()
    {
        LayMinister cl = LayMinisterFactory.getLayMinister("1", "Earle");
        ResponseEntity<LayMinister> response = restTempl.postForEntity(url + "/create", cl, LayMinister.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getName() + " " + response.getBody().getId());
    }

    @Test
    public void m_read()
    {
        LayMinister c  = restTempl.getForObject(url + "/read/1", LayMinister.class);
        assertNotNull(c);
        System.out.println(c.getId() + " " + c.getName());
    }

    @Test
    public void n_update()
    {
        String id = "1";
        LayMinister c  = restTempl.getForObject(url + "/read/" + id, LayMinister.class);

        restTempl.put(url + "/update/" + id, c);
        LayMinister update = restTempl.getForObject(url + "/read/" + id, LayMinister.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getId() + " " + update.getName());

    }

    @Test
    public void o_delete()
    {
        String id = "1";
        LayMinister c  = restTempl.getForObject(url + "/read/" + id, LayMinister.class);
        assertEquals(id, c.getId());
        System.out.println(c.getId() + c.getName());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, LayMinister.class);

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
