package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.DeceasedGoer;
import za.ca.cput.assignment5kaylin.factory.DeceasedGoerFactory;

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
