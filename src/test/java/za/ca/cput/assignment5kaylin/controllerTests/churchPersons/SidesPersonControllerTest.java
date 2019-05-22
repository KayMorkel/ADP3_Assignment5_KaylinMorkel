package za.ca.cput.assignment5kaylin.controllerTests.churchPersons;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
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
import za.ca.cput.assignment5kaylin.domain.churchPersons.SidesPerson;
import za.ca.cput.assignment5kaylin.factory.churchPersons.SidesPersonFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SidesPersonControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/sidesPerson";

    @Test
    public void l_create()
    {
        SidesPerson cl = SidesPersonFactory.getSideP("1000", "weekly");
        ResponseEntity<SidesPerson> response = restTempl.postForEntity(url + "/create", cl, SidesPerson.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getSal() + " " + response.getBody().getPayType());
    }

    @Test
    public void m_read()
    {
        SidesPerson c  = restTempl.getForObject(url + "/read/1000", SidesPerson.class);
        assertNotNull(c);
        System.out.println(c.getSal() + " " + c.getPayType());
    }

    @Test
    public void n_update()
    {
        String id = "1000";
        SidesPerson c  = restTempl.getForObject(url + "/read/" + id, SidesPerson.class);

        restTempl.put(url + "/update/" + id, c);
        SidesPerson update = restTempl.getForObject(url + "/read/" + id, SidesPerson.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getSal() + " " + update.getPayType());

    }

    @Test
    public void o_delete()
    {
        String id = "1000";
        SidesPerson c  = restTempl.getForObject(url + "/read/" + id, SidesPerson.class);
        assertEquals(id, c.getSal());
        System.out.println(c.getSal() + c.getPayType());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, SidesPerson.class);

        //assertNotSame(id, c.getSal());

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
