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
import za.ca.cput.assignment5kaylin.domain.churchClasses.Class;
import za.ca.cput.assignment5kaylin.factory.churchClasses.ClassFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClassControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/class";

    @Test
    public void l_create()
    {
        Class cl = ClassFactory.getClass("1", 2);
        ResponseEntity<Class> response = restTempl.postForEntity(url + "/create", cl, Class.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getClassId() + " " + response.getBody().getNumOfStudents());
    }

    @Test
    public void m_read()
    {
        Class c  = restTempl.getForObject(url + "/read/1", Class.class);
        assertNotNull(c);
        System.out.println(c.getClassId() + " " + c.getNumOfStudents());
    }

    @Test
    public void n_update()
    {
        String id = "1";
        Class c  = restTempl.getForObject(url + "/read/" + id, Class.class);

        restTempl.put(url + "/update/" + id, c);
        Class update = restTempl.getForObject(url + "/read/" + id, Class.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getClassId() + " " + update.getNumOfStudents());

    }

    @Test
    public void o_delete()
    {
        String id = "1";
        Class c  = restTempl.getForObject(url + "/read/" + id, Class.class);
        assertEquals(id, c.getClassId());
        System.out.println(c.getClassId() + c.getNumOfStudents());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, Class.class);

        assertNotSame(id, c.getClassId());

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
