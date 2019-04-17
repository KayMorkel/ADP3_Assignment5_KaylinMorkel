package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.ChurchCongregationGoer;
import za.ca.cput.assignment5kaylin.factory.ChurchCongregationGoerFactory;

public class ChurchCongregationGoerFactoryTest {
    @Test
    public void getCongGoer() {
        String id = "CG3";
        String type = "deceased";
        ChurchCongregationGoer goer = ChurchCongregationGoerFactory.getCongGoer(id, type);
        Assert.assertEquals(id, goer.getGoerId());
        System.out.println(goer.getGoerId());
    }
}