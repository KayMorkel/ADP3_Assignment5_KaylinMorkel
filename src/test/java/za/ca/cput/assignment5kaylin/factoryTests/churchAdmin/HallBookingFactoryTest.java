package za.ca.cput.assignment5kaylin.factoryTests.churchAdmin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.HallBooking;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.HallBookingFactory;

public class HallBookingFactoryTest
{
    @Test
    public void getBooking() {
        String bookingId = "HB104";
        String eventType = "Birthday";
        HallBooking hb = HallBookingFactory.getBooking(bookingId, eventType);
        Assert.assertEquals(eventType, hb.getEventType());
        System.out.println(hb.getEventType());
    }
}
