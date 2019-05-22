package za.ca.cput.assignment5kaylin.factoryTests.churchPersons;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.churchPersons.LayMinister;
import za.ca.cput.assignment5kaylin.factory.churchPersons.LayMinisterFactory;

public class LayMinisterFactoryTest
{
    @Test
    public void getLayMinister() {
        String id = "P15989";
        String name = "0834527896";
        LayMinister lm = LayMinisterFactory.getLayMinister(id, name);
        Assert.assertEquals(name, lm.getName());
        System.out.println(lm.getName());
    }
}
