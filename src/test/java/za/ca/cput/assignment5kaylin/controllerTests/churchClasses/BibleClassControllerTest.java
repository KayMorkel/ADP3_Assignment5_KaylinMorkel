package za.ca.cput.assignment5kaylin.controllerTests.churchClasses;

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
import za.ca.cput.assignment5kaylin.domain.churchClasses.BibleClass;
import za.ca.cput.assignment5kaylin.factory.churchClasses.BibleClassFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BibleClassControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/bibleClass";

    @Test
    public void l_create()
    {
        BibleClass cl = BibleClassFactory.getBibClass("1", "08:00");
        ResponseEntity<BibleClass> response = restTempl.postForEntity(url + "/create", cl, BibleClass.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getClassNo() + " " + response.getBody().getClassTime());
    }

    @Test
    public void m_read()
    {
        BibleClass c  = restTempl.getForObject(url + "/read/1", BibleClass.class);
        assertNotNull(c);
        System.out.println(c.getClassNo() + " " + c.getClassTime());
    }

    @Test
    public void n_update()
    {
        String id = "1";
        BibleClass c  = restTempl.getForObject(url + "/read/" + id, BibleClass.class);

        restTempl.put(url + "/update/" + id, c);
        BibleClass update = restTempl.getForObject(url + "/read/" + id, BibleClass.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getClassNo() + " " + update.getClassTime());

    }

    @Test
    public void o_delete()
    {
        String id = "1";
        BibleClass c  = restTempl.getForObject(url + "/read/" + id, BibleClass.class);
        assertEquals(id, c.getClassNo());
        System.out.println(c.getClassNo() + c.getClassTime());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, BibleClass.class);

        assertNotSame(id, c.getClassNo());

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
