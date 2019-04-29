package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.HallBooking;

import java.util.Set;

public interface HallBookingRepository extends GenIRepository<HallBooking, String>
{
    Set<HallBooking> getAll();
}
