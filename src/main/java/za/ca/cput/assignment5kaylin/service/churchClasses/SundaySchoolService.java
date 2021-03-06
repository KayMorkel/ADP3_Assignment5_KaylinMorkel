package za.ca.cput.assignment5kaylin.service.churchClasses;

import za.ca.cput.assignment5kaylin.domain.churchClasses.SundaySchool;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.List;
import java.util.Set;

public interface SundaySchoolService extends GenIService<SundaySchool, String>
{
    SundaySchool retrieveById(String id);
    List<SundaySchool> getAll();
}
