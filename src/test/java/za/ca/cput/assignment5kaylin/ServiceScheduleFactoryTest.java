package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.ServiceSchedule;
import za.ca.cput.assignment5kaylin.factory.ServiceScheduleFactory;

public class ServiceScheduleFactoryTest
{
    @Test
    public void getSS() {
        String id = "SS563";
        String type = "Sunday service";
        ServiceSchedule ss = ServiceScheduleFactory.getSS(id, type);
        Assert.assertEquals(id, ss.getId());
        System.out.println(ss.getId());
    }
}
