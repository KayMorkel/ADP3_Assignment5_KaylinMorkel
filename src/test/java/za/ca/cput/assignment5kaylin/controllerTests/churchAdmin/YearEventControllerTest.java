package za.ca.cput.assignment5kaylin.controllerTests.churchAdmin;

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
import za.ca.cput.assignment5kaylin.domain.churchAdmin.YearEvent;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.YearEventFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class YearEventControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/yearEvent";

    @Test
    public void l_create()
    {
        YearEvent cl = YearEventFactory.getYearEvent("12", "Birthday");
        ResponseEntity<YearEvent> response = restTempl.postForEntity(url + "/create", cl, YearEvent.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getEventNum() + " " + response.getBody().getName());
    }

    @Test
    public void m_read()
    {
        YearEvent c  = restTempl.getForObject(url + "/read/12", YearEvent.class);
        assertNotNull(c);
        System.out.println(c.getEventNum() + " " + c.getName());
    }

    @Test
    public void n_update()
    {
        String id = "12";
        YearEvent c  = restTempl.getForObject(url + "/read/" + id, YearEvent.class);

        restTempl.put(url + "/update/" + id, c);
        YearEvent update = restTempl.getForObject(url + "/read/" + id, YearEvent.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getEventNum() + " " + update.getName());

    }

    @Test
    public void o_delete()
    {
        String id = "12";
        YearEvent c  = restTempl.getForObject(url + "/read/" + id, YearEvent.class);
        assertEquals(id, c.getEventNum());
        System.out.println(c.getEventNum() + c.getName());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, YearEvent.class);

        assertNotSame(id, c.getEventNum());

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
