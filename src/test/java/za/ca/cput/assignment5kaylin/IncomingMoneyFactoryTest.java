package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.IncomingMoney;
import za.ca.cput.assignment5kaylin.factory.IncomingMoneyFactory;

public class IncomingMoneyFactoryTest
{
    @Test
    public void getIncMon() {
        String id = "IM106";
        String from = "bake sale";
        IncomingMoney im = IncomingMoneyFactory.getIncMon(id, from);
        Assert.assertEquals(id, im.getId());
        System.out.println(im.getId());
    }
}
