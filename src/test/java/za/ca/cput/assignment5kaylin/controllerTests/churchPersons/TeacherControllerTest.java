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
import za.ca.cput.assignment5kaylin.domain.churchPersons.Teacher;
import za.ca.cput.assignment5kaylin.factory.churchPersons.TeacherFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TeacherControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/teacher";

    @Test
    public void l_create()
    {
        Teacher cl = TeacherFactory.getTeacher("1", "bible class");
        ResponseEntity<Teacher> response = restTempl.postForEntity(url + "/create", cl, Teacher.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getId() + " " + response.getBody().getType());
    }

    @Test
    public void m_read()
    {
        Teacher c  = restTempl.getForObject(url + "/read/1", Teacher.class);
        assertNotNull(c);
        System.out.println(c.getId() + " " + c.getType());
    }

    @Test
    public void n_update()
    {
        String id = "1";
        Teacher c  = restTempl.getForObject(url + "/read/" + id, Teacher.class);

        restTempl.put(url + "/update/" + id, c);
        Teacher update = restTempl.getForObject(url + "/read/" + id, Teacher.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getId() + " " + update.getType());

    }

    @Test
    public void o_delete()
    {
        String id = "1";
        Teacher c  = restTempl.getForObject(url + "/read/" + id, Teacher.class);
        assertNotNull(c);
        System.out.println(c.getId() + c.getType());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, Teacher.class);

        //assertNotSame(id, c.getId());

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
