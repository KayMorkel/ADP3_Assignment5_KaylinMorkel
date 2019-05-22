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
import za.ca.cput.assignment5kaylin.domain.churchAdmin.ServiceSchedule;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.ServiceScheduleFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ServiceScheduleControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/serviceSchedule";

    @Test
    public void l_create()
    {
        ServiceSchedule cl = ServiceScheduleFactory.getSS("12", "sunday");
        ResponseEntity<ServiceSchedule> response = restTempl.postForEntity(url + "/create", cl, ServiceSchedule.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getId() + " " + response.getBody().getType());
    }

    @Test
    public void m_read()
    {
        ServiceSchedule c  = restTempl.getForObject(url + "/read/12", ServiceSchedule.class);
        assertNotNull(c);
        System.out.println(c.getId() + " " + c.getType());
    }

    @Test
    public void n_update()
    {
        String id = "12";
        ServiceSchedule c  = restTempl.getForObject(url + "/read/" + id, ServiceSchedule.class);

        restTempl.put(url + "/update/" + id, c);
        ServiceSchedule update = restTempl.getForObject(url + "/read/" + id, ServiceSchedule.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getId() + " " + update.getType());

    }

    @Test
    public void o_delete()
    {
        String id = "12";
        ServiceSchedule c  = restTempl.getForObject(url + "/read/" + id, ServiceSchedule.class);
        assertEquals(id, c.getId());
        System.out.println(c.getId() + c.getType());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, ServiceSchedule.class);

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
