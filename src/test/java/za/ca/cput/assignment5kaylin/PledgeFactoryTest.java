package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.Pledge;
import za.ca.cput.assignment5kaylin.factory.PledgeFactory;

public class PledgeFactoryTest
{
    @Test
    public void getPledge() {
        String pledgeNum = "P500";
        String paymentType = "EFT";
        Pledge pl = PledgeFactory.getPledge(pledgeNum, paymentType);
        Assert.assertEquals(pledgeNum, pl.getPledgeNum());
        System.out.println(pl.getPledgeNum());
    }
}
