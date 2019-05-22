package za.ca.cput.assignment5kaylin.factoryTests.churchPersons;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.churchPersons.DeceasedGoer;
import za.ca.cput.assignment5kaylin.factory.churchPersons.DeceasedGoerFactory;

public class DeceasedGoerFactoryTest
{
    @Test
    public void getDeceased() {
        String decNum = "Dec156";
        String yearDied = "2000";
        DeceasedGoer dec = DeceasedGoerFactory.getDeceased(decNum, yearDied);
        Assert.assertEquals(decNum, dec.getDecNum());
        System.out.println(dec.getDecNum());
    }
}
