package za.ca.cput.assignment5kaylin.repository.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.Person;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface PersonRepository extends GenIRepository<Person, String>
{
    Set<Person> getAll();
}
