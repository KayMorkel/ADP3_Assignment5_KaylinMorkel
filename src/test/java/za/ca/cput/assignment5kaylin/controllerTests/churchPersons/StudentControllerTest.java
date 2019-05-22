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
import za.ca.cput.assignment5kaylin.domain.churchPersons.Student;
import za.ca.cput.assignment5kaylin.factory.churchPersons.StudentFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/student";

    @Test
    public void l_create()
    {
        Student cl = StudentFactory.getStudent("1", "bible class");
        ResponseEntity<Student> response = restTempl.postForEntity(url + "/create", cl, Student.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getStudId() + " " + response.getBody().getStudType());
    }

    @Test
    public void m_read()
    {
        Student c  = restTempl.getForObject(url + "/read/1", Student.class);
        assertNotNull(c);
        System.out.println(c.getStudId() + " " + c.getStudType());
    }

    @Test
    public void n_update()
    {
        String id = "1";
        Student c  = restTempl.getForObject(url + "/read/" + id, Student.class);

        restTempl.put(url + "/update/" + id, c);
        Student update = restTempl.getForObject(url + "/read/" + id, Student.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getStudId() + " " + update.getStudType());

    }

    @Test
    public void o_delete()
    {
        String id = "1";
        Student c  = restTempl.getForObject(url + "/read/" + id, Student.class);
        assertNotNull(c);
        System.out.println(c.getStudId() + c.getStudType());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, Student.class);

        //assertNotSame(id, c.getStudId());

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
