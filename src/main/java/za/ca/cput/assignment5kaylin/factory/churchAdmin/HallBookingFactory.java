package za.ca.cput.assignment5kaylin.factory.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.HallBooking;

public class HallBookingFactory
{
    public static HallBooking getBooking(String hallBookingId, String eventType)
    {
        return new HallBooking.Builder().hallBookId(hallBookingId)
                .eventType(eventType)
                .build();
    }
}
