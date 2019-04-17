package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.YearEvent;
import za.ca.cput.assignment5kaylin.factory.YearEventFactory;

public class YearEventFactoryTest
{
    @Test
    public void getYearEvent() {
        String num = "YE70";
        String name = "Family day";
        YearEvent ye = YearEventFactory.getYearEvent(num, name);
        Assert.assertEquals(num, ye.getEventNum());
        System.out.println(ye.getEventNum());
    }
}
