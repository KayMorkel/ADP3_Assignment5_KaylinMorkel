package za.ca.cput.assignment5kaylin.factoryTests.login;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.login.LoginStatus;
import za.ca.cput.assignment5kaylin.factory.login.LoginStatusFactory;

public class LoginStatusFactoryTest
{
    @Test
    public void getLoginStat() {
        String statNum = "Mar253";
        String status = "Abekai256";
        LoginStatus logStat = LoginStatusFactory.getLoginStat(statNum, status);
        Assert.assertEquals(statNum, logStat.getStatNum());
        System.out.println(logStat.getStatNum());
    }
}
