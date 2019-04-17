package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.UsageOfMoney;
import za.ca.cput.assignment5kaylin.factory.UsageOfMoneyFactory;

public class UsageOfMoneyFactoryTest
{
    @Test
    public void getUsage() {
        String id = "UOMA106";
        String usedFor = "electricity";
        UsageOfMoney uom = UsageOfMoneyFactory.getUsage(id, usedFor);
        Assert.assertEquals(id, uom.getId());
        System.out.println(uom.getId());
    }
}
