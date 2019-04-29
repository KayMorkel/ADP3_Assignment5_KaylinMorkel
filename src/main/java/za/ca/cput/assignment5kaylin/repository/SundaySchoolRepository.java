package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.SundaySchool;

import java.util.Set;

public interface SundaySchoolRepository extends GenIRepository<SundaySchool, String>
{
    Set<SundaySchool> getAll();
}
