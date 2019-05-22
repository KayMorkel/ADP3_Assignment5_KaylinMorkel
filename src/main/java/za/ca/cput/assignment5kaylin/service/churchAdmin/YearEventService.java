package za.ca.cput.assignment5kaylin.service.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.YearEvent;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.Set;

public interface YearEventService extends GenIService<YearEvent, String>
{
    Set<YearEvent> getAll();
}
