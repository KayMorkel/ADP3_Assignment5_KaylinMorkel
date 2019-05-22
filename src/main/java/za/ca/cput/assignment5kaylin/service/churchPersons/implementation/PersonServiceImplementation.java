package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Person;
import za.ca.cput.assignment5kaylin.repository.churchPersons.PersonRepository;
import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.PersonRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.PersonService;

import java.util.Set;

@Service
public class PersonServiceImplementation implements PersonService
{
    @Autowired
    private PersonRepositoryImplementation repo;

    /*private static PersonServiceImplementation service = null;
    private PersonRepository repo;

    private PersonServiceImplementation()
    {
        this.repo = PersonRepositoryImplementation.getRepository();
    }

    public static PersonServiceImplementation getService()
    {
        if(service == null) service = new PersonServiceImplementation();
        return service;
    }*/

    @Override
    public Set<Person> getAll() {
        return this.repo.getAll();
    }

    @Override
    public Person create(Person person) {
        return this.repo.create(person);
    }

    @Override
    public Person read(String s) {
        return this.repo.read(s);
    }

    @Override
    public Person update(Person person) {
        return this.repo.update(person);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
