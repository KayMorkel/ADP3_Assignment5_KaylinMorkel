package za.ca.cput.assignment5kaylin.repository.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.HallBooking;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface HallBookingRepository extends GenIRepository<HallBooking, String>
{
    Set<HallBooking> getAll();
}
