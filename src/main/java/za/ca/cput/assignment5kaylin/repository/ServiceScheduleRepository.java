package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.ServiceSchedule;

import java.util.Set;

public interface ServiceScheduleRepository extends GenIRepository<ServiceSchedule, String>
{
    Set<ServiceSchedule> getAll();
}
