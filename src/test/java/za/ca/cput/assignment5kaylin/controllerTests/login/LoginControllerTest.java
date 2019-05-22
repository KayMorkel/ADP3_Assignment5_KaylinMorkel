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
import za.ca.cput.assignment5kaylin.domain.login.Login;
import za.ca.cput.assignment5kaylin.factory.login.LoginFactory;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginControllerTest
{
    @Autowired
    private TestRestTemplate restTempl;
    private String url = "http://localhost:8080/login";

    @Test
    public void l_create()
    {
        Login cl = LoginFactory.getLogin("2", "5698");
        ResponseEntity<Login> response = restTempl.postForEntity(url + "/create", cl, Login.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody().getUsername() + " " + response.getBody().getPassword());
    }

    @Test
    public void m_read()
    {
        Login c  = restTempl.getForObject(url + "/read/2", Login.class);
        assertNotNull(c);
        System.out.println(c.getUsername() + " " + c.getPassword());
    }

    @Test
    public void n_update()
    {
        String id = "2";
        Login c  = restTempl.getForObject(url + "/read/" + id, Login.class);

        restTempl.put(url + "/update/" + id, c);
        Login update = restTempl.getForObject(url + "/read/" + id, Login.class);
        assertNotNull(update);
        //System.out.println(c.getChurchId() + " " + c.getAddress());
        System.out.println(update.getUsername() + " " + update.getPassword());

    }

    @Test
    public void o_delete()
    {
        String id = "2";
        Login c  = restTempl.getForObject(url + "/read/" + id, Login.class);
        assertEquals(id, c.getUsername());
        System.out.println(c.getUsername() + c.getPassword());
        restTempl.delete(url+ "/delete/" + id);

        c = restTempl.getForObject(url + "/read/"+id, Login.class);

        //assertNotSame(id, c.getUsername());

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
