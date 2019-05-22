package za.ca.cput.assignment5kaylin.repository.churchClasses;

import za.ca.cput.assignment5kaylin.domain.churchClasses.SundaySchool;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface SundaySchoolRepository extends GenIRepository<SundaySchool, String>
{
    Set<SundaySchool> getAll();
}
