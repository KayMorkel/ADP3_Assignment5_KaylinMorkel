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
import za.ca.cput.assignment5kaylin.domain.churchClasses.SundaySchool;
import za.ca.cput.assignment5kaylin.factory.churchClasses.SundaySchoolFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SundaySchoolControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/sundaySchool";

    @Test
    public void l_create()
    {
        SundaySchool cl = SundaySchoolFactory.getSunSchool("1");
        ResponseEntity<SundaySchool> response = restTempl.postForEntity(url + "/create", cl, SundaySchool.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getClassNo() + " " + response.getBody().getClassNo());
    }

    @Test
    public void m_read()
    {
        SundaySchool c  = restTempl.getForObject(url + "/read/1", SundaySchool.class);
        assertNotNull(c);
        System.out.println(c.getClassNo() + " " + c.getClassNo());
    }

    @Test
    public void n_update()
    {
        String id = "1";
        SundaySchool c  = restTempl.getForObject(url + "/read/" + id, SundaySchool.class);

        restTempl.put(url + "/update/" + id, c);
        SundaySchool update = restTempl.getForObject(url + "/read/" + id, SundaySchool.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getClassNo() + " " + update.getClassNo());

    }

    @Test
    public void o_delete()
    {
        String id = "1";
        SundaySchool c  = restTempl.getForObject(url + "/read/" + id, SundaySchool.class);
        assertEquals(id, c.getClassNo());
        System.out.println(c.getClassNo() + c.getClassNo());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, SundaySchool.class);

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
