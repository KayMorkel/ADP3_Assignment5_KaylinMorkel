package za.ca.cput.assignment5kaylin.factoryTests.churchPersons;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Warden;
import za.ca.cput.assignment5kaylin.factory.churchPersons.WardenFactory;

public class WardenFactoryTest
{
    @Test
    public void getWarden()
    {
        String name = "John";
        String telNum = "083 123 4569";
        Warden ward = WardenFactory.getWarden(name, telNum );
        Assert.assertNotNull(ward.getWardenName());
    }
}
