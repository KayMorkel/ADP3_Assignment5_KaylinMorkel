package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.MarriedGoer;
import za.ca.cput.assignment5kaylin.factory.MarriedGoerFactory;

public class MarriedGoerFactoryTest
{
    @Test
    public void getMarried() {
        String id = "Mar253";
        String yearMarried = "1991";
        MarriedGoer mar = MarriedGoerFactory.getMarried(id, yearMarried);
        Assert.assertEquals(id, mar.getId());
        System.out.println(mar.getId());
    }
}
