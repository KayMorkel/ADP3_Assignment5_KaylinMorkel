package za.ca.cput.assignment5kaylin.factoryTests.churchAdmin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.ServiceSchedule;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.ServiceScheduleFactory;

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
