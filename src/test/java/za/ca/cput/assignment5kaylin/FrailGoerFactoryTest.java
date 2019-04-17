package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.FrailGoer;
import za.ca.cput.assignment5kaylin.factory.FrailGoerFactory;

public class FrailGoerFactoryTest
{
    @Test
    public void getFrailP() {
        String num = "FP56";
        String type = "Old age";
        FrailGoer fray = FrailGoerFactory.getFrailP(num, type);
        Assert.assertEquals(num, fray.getFrailNum());
        System.out.println(fray.getFrailNum());
    }
}
