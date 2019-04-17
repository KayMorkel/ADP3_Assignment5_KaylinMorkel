package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.Priest;
import za.ca.cput.assignment5kaylin.factory.PriestFactory;

public class PriestFactoryTest
{
    @Test
    public void getPriest() {
        String sal = "Pr789";
        String inductDate = "19 March 2019";
        Priest pr = PriestFactory.getPriest(sal, inductDate);
        Assert.assertEquals(sal, pr.getInductDate());
        System.out.println(pr.getInductDate());
    }
}
