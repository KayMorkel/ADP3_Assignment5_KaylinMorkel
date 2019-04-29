package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.Person;

import java.util.Set;

public interface PersonRepository extends GenIRepository<Person, String>
{
    Set<Person> getAll();
}
