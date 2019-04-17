package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.StandardGoer;
import za.ca.cput.assignment5kaylin.factory.StandardGoerFactory;

public class StandardGoerFactoryTest
{
    @Test
    public void getChurch() {
        boolean pledger = true;
        StandardGoer sg = StandardGoerFactory.getIsPledger(pledger);
        Assert.assertEquals(pledger, sg.isPledger());
        System.out.println(sg.isPledger());
    }
}
