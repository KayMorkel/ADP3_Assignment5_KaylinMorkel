package za.ca.cput.assignment5kaylin.service.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.ServiceSchedule;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.List;
import java.util.Set;

public interface ServiceScheduleService extends GenIService<ServiceSchedule, String>
{
    ServiceSchedule retrieveById(String id);
    List<ServiceSchedule> getAll();
}
