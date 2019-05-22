package za.ca.cput.assignment5kaylin.repository.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.SidesPerson;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface SidesPersonRepository extends GenIRepository<SidesPerson, String>
{
    Set<SidesPerson> getAll();
}
