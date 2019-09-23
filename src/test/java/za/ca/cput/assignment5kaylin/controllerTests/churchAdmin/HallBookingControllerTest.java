package za.ca.cput.assignment5kaylin.controllerTests.churchAdmin;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.HallBooking;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.HallBookingFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HallBookingControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/hallBooking";

    @Test
    public void l_create()
    {
        HallBooking cl = HallBookingFactory.getBooking("1", "Birthday");
        ResponseEntity<HallBooking> response = restTempl.withBasicAuth("warden", "warden")
                .postForEntity(url + "/create", cl, HallBooking.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getHallBookId() + " " + response.getBody().getEventType());
    }

    @Test
    public void m_read()
    {
        HallBooking c  = restTempl.withBasicAuth("warden", "warden")
                .getForObject(url + "/read/1", HallBooking.class);
        assertNotNull(c);
        System.out.println(c.getHallBookId() + " " + c.getEventType());
    }

    @Test
    public void n_update()
    {
        String id = "1";
        HallBooking c  = restTempl.getForObject(url + "/read/" + id, HallBooking.class);

        restTempl.put(url + "/update/" + id, c);
        HallBooking update = restTempl.getForObject(url + "/read/" + id, HallBooking.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getHallBookId() + " " + update.getEventType());

    }

    @Test
    public void o_delete()
    {
        String id = "1";
        HallBooking c  = restTempl.getForObject(url + "/read/" + id, HallBooking.class);
        assertEquals(id, c.getHallBookId());
        System.out.println(c.getHallBookId() + c.getEventType());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, HallBooking.class);

        assertNotSame(id, c.getHallBookId());

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
       // assertEquals(HttpStatus.OK, respoEnt.getStatusCode());
        assertNotSame(null, respoEnt.getBody());

        //System.out.println(respoEnt);
    }
}
