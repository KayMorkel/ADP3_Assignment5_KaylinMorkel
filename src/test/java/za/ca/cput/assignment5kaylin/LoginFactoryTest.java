package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.Login;
import za.ca.cput.assignment5kaylin.factory.LoginFactory;

public class LoginFactoryTest
{
    @Test
    public void getMarried() {
        String username = "Mar253";
        String password = "Abekai256";
        Login log = LoginFactory.getLogin(username, password);
        Assert.assertEquals(username, log.getUsername());
        System.out.println(log.getUsername());
    }
}
