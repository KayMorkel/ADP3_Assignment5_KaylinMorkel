package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.Church;
import za.ca.cput.assignment5kaylin.factory.ChurchFactory;

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
