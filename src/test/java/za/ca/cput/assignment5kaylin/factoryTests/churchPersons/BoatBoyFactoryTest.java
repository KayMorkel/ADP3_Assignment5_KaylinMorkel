package za.ca.cput.assignment5kaylin.factoryTests.churchPersons;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.churchPersons.BoatBoy;
import za.ca.cput.assignment5kaylin.factory.churchPersons.BoatBoyFactory;

public class BoatBoyFactoryTest
{
    @Test
    public void getSidesP() {
        String sal = "23000";
        String payType = "monthly";
        BoatBoy sp = BoatBoyFactory.getBB(sal, payType);
        Assert.assertEquals(sal, sp.getSal());
        System.out.println(sp.getSal());
    }
}
