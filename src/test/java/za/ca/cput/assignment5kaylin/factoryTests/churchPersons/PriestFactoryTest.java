package za.ca.cput.assignment5kaylin.factoryTests.churchPersons;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Priest;
import za.ca.cput.assignment5kaylin.factory.churchPersons.PriestFactory;

public class PriestFactoryTest
{
    @Test
    public void getPriest() {
        String sal = "Pr789";
        String inductDate = "19 March 2019";
        Priest pr = PriestFactory.getPriest(sal, inductDate);
        Assert.assertEquals(inductDate, pr.getInductDate());
        System.out.println(pr.getInductDate());
    }
}
