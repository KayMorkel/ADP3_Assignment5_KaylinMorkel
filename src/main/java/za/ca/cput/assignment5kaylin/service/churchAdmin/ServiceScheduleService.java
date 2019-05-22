package za.ca.cput.assignment5kaylin.service.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.ServiceSchedule;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.Set;

public interface ServiceScheduleService extends GenIService<ServiceSchedule, String>
{
    Set<ServiceSchedule> getAll();
}
