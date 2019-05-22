package za.ca.cput.assignment5kaylin.repository.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.ServiceSchedule;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface ServiceScheduleRepository extends GenIRepository<ServiceSchedule, String>
{
    Set<ServiceSchedule> getAll();
}
