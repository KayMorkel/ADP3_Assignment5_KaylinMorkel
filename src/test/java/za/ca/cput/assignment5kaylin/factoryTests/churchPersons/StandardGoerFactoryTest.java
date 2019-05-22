package za.ca.cput.assignment5kaylin.factoryTests.churchPersons;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.churchPersons.StandardGoer;
import za.ca.cput.assignment5kaylin.factory.churchPersons.StandardGoerFactory;

public class StandardGoerFactoryTest
{
    @Test
    public void getChurch() {
        String pledger = "yes";
        StandardGoer sg = StandardGoerFactory.getIsPledger(pledger);
        Assert.assertEquals(pledger, sg.getPledger());
        System.out.println(sg.getPledger());
    }
}
