package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.HallBooking;
import za.ca.cput.assignment5kaylin.factory.HallBookingFactory;

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
