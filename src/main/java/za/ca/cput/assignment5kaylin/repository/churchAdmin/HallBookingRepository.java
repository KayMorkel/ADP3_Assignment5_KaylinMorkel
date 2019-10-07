package za.ca.cput.assignment5kaylin.repository.churchAdmin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.HallBooking;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

@Repository
public interface HallBookingRepository extends JpaRepository<HallBooking, String>
{
    //Set<HallBooking> getAll();
}
