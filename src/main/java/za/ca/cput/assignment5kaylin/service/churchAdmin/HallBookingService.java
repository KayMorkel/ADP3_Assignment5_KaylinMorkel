package za.ca.cput.assignment5kaylin.service.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.HallBooking;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.Set;

public interface HallBookingService extends GenIService<HallBooking, String>
{
    Set<HallBooking> getAll();
}
