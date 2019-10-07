package za.ca.cput.assignment5kaylin.service.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.Person;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.List;
import java.util.Set;

public interface PersonService extends GenIService<Person, String>
{
    Person retrieveById(String id);
    List<Person> getAll();
}
