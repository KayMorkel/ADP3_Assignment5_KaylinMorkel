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
import za.ca.cput.assignment5kaylin.domain.churchPersons.ChurchCongregationGoer;
import za.ca.cput.assignment5kaylin.factory.churchPersons.ChurchCongregationGoerFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ChurchCongregationGoerControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/churchCongregationGoer";

    @Test
    public void l_create()
    {
        ChurchCongregationGoer cl = ChurchCongregationGoerFactory.getCongGoer("1", "standard");
        ResponseEntity<ChurchCongregationGoer> response = restTempl.postForEntity(url + "/create", cl, ChurchCongregationGoer.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getGoerId() + " " + response.getBody().getGoerType());
    }

    @Test
    public void m_read()
    {
        ChurchCongregationGoer c  = restTempl.getForObject(url + "/read/1", ChurchCongregationGoer.class);
        assertNotNull(c);
        System.out.println(c.getGoerId() + " " + c.getGoerType());
    }

    @Test
    public void n_update()
    {
        String id = "1";
        ChurchCongregationGoer c  = restTempl.getForObject(url + "/read/" + id, ChurchCongregationGoer.class);

        restTempl.put(url + "/update/" + id, c);
        ChurchCongregationGoer update = restTempl.getForObject(url + "/read/" + id, ChurchCongregationGoer.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getGoerId() + " " + update.getGoerType());

    }

    @Test
    public void o_delete()
    {
        String id = "1";
        ChurchCongregationGoer c  = restTempl.getForObject(url + "/read/" + id, ChurchCongregationGoer.class);
        assertEquals(id, c.getGoerId());
        System.out.println(c.getGoerId() + c.getGoerType());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, ChurchCongregationGoer.class);

        assertNotSame(id, c.getGoerId());

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
