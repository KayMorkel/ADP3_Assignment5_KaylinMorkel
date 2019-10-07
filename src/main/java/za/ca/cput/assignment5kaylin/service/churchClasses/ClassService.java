package za.ca.cput.assignment5kaylin.service.churchClasses;

import za.ca.cput.assignment5kaylin.domain.churchClasses.Class;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.List;
import java.util.Set;

public interface ClassService extends GenIService<Class, String>
{
    Class retrieveById(String id);
    List<Class> getAll();
}
