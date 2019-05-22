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
import za.ca.cput.assignment5kaylin.domain.churchPersons.Person;
import za.ca.cput.assignment5kaylin.factory.churchPersons.PersonFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/person";

    @Test
    public void l_create()
    {
        Person cl = PersonFactory.getPerson("Angie", "021 952 9568");
        ResponseEntity<Person> response = restTempl.postForEntity(url + "/create", cl, Person.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getpName() + " " + response.getBody().getpTelNumber());
    }

    @Test
    public void m_read()
    {
        Person c  = restTempl.getForObject(url + "/read/Angie", Person.class);
        assertNotNull(c);
        System.out.println(c.getpName() + " " + c.getpTelNumber());
    }

    @Test
    public void n_update()
    {
        String id = "Angie";
        Person c  = restTempl.getForObject(url + "/read/" + id, Person.class);

        restTempl.put(url + "/update/" + id, c);
        Person update = restTempl.getForObject(url + "/read/" + id, Person.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getpName() + " " + update.getpTelNumber());

    }

    @Test
    public void o_delete()
    {
        String id = "Angie";
        Person c  = restTempl.getForObject(url + "/read/" + id, Person.class);
        assertEquals(id, c.getpName());
        System.out.println(c.getpName() + c.getpTelNumber());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, Person.class);

        assertNotSame(id, c.getpName());

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
