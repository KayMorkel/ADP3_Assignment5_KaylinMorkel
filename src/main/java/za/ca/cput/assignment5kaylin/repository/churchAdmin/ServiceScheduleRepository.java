package za.ca.cput.assignment5kaylin.repository.churchAdmin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.ServiceSchedule;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;
@Repository
public interface ServiceScheduleRepository extends JpaRepository<ServiceSchedule, String>
{
    //Set<ServiceSchedule> getAll();
}
