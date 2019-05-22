package za.ca.cput.assignment5kaylin.controllerTests.login;

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
import za.ca.cput.assignment5kaylin.domain.login.LoginStatus;
import za.ca.cput.assignment5kaylin.factory.login.LoginStatusFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginStatusControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/loginStatus";

    @Test
    public void l_create()
    {
        LoginStatus cl = LoginStatusFactory.getLoginStat("1", "online");
        ResponseEntity<LoginStatus> response = restTempl.postForEntity(url + "/create", cl, LoginStatus.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getStatNum() + " " + response.getBody().getStatus());
    }

    @Test
    public void m_read()
    {
        LoginStatus c  = restTempl.getForObject(url + "/read/1", LoginStatus.class);
        assertNotNull(c);
        System.out.println(c.getStatNum() + " " + c.getStatus());
    }

    @Test
    public void n_update()
    {
        String id = "1";
        LoginStatus c  = restTempl.getForObject(url + "/read/" + id, LoginStatus.class);

        restTempl.put(url + "/update/" + id, c);
        LoginStatus update = restTempl.getForObject(url + "/read/" + id, LoginStatus.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getStatNum() + " " + update.getStatus());

    }

    @Test
    public void o_delete()
    {
        String id = "1";
        LoginStatus c  = restTempl.getForObject(url + "/read/" + id, LoginStatus.class);
        assertEquals(id, c.getStatNum());
        System.out.println(c.getStatNum() + c.getStatus());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, LoginStatus.class);

        assertNotSame(id, c.getStatNum());

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
