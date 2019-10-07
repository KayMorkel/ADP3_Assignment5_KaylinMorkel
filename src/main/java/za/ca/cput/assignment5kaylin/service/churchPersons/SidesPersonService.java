package za.ca.cput.assignment5kaylin.service.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.SidesPerson;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.List;
import java.util.Set;

public interface SidesPersonService extends GenIService<SidesPerson, String>
{
    SidesPerson retrieveById(String id);
    List<SidesPerson> getAll();
}
