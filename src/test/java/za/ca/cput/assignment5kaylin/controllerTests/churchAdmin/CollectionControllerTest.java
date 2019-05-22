package za.ca.cput.assignment5kaylin.controllerTests.churchAdmin;

import javafx.print.Collation;
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
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Collection;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.CollectionFactory;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CollectionControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/collection";

    @Test
    public void l_create()
    {
        Collection cl = CollectionFactory.getCollection("1", 1000.00);
        ResponseEntity<Collection> response = restTempl.postForEntity(url + "/create", cl, Collection.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getCollectId() + " " + response.getBody().getCollectAmt());
    }

    @Test
    public void m_read()
    {
        Collection c  = restTempl.getForObject(url + "/read/1", Collection.class);
        assertNotNull(c);
        System.out.println(c.getCollectId() + " " + c.getCollectAmt());
    }

    @Test
    public void n_update()
    {
        String id = "1";
        Collection c  = restTempl.getForObject(url + "/read/" + id, Collection.class);

        restTempl.put(url + "/update", id, c);
        Collection update = restTempl.getForObject(url + "/read/" + id, Collection.class);
        assertNotNull(update);
        //System.out.println(c.getCollectId() + " " + c.getCollectAmt());
        //System.out.println(update.getCollectId() + " " + update.getCollectAmt());

    }

    @Test
    public void o_delete()
    {
        String id = "1";
        Collection c  = restTempl.getForObject(url + "/read/" + id, Collection.class);
        assertEquals(id, c.getCollectId());
        //System.out.println(c.getCollectId() + c.getCollectAmt());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, Collection.class);

        //assertNotNull(c);

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
