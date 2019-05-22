package za.ca.cput.assignment5kaylin.factoryTests.churchPersons;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.churchPersons.SidesPerson;
import za.ca.cput.assignment5kaylin.factory.churchPersons.SidesPersonFactory;

public class SidesPersonFactoryTest
{
    @Test
    public void getSidesP() {
        String sal = "23000";
        String payType = "monthly";
        SidesPerson sp = SidesPersonFactory.getSideP(sal, payType);
        Assert.assertEquals(sal, sp.getSal());
        System.out.println(sp.getSal());
    }
}
