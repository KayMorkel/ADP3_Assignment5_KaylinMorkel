package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.SidesPerson;

import java.util.Set;

public interface SidesPersonRepository extends GenIRepository<SidesPerson, String>
{
    Set<SidesPerson> getAll();
}
