package za.ca.cput.assignment5kaylin.factoryTests.churchAdmin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Church;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.ChurchFactory;

public class ChurchFactoryTest
{
    @Test
    public void getChurch() {
        String churchId = "A106";
        String address = "19 Lotus Street";
        Church church = ChurchFactory.getChurch(churchId, address);
        Assert.assertEquals(churchId, church.getChurchId());
        System.out.println(church.getChurchId());
    }

}
