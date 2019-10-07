package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Person;
import za.ca.cput.assignment5kaylin.repository.churchPersons.PersonRepository;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.PersonRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.PersonService;

import java.util.List;
import java.util.Set;

@Service
public class PersonServiceImplementation implements PersonService
{
    @Autowired
    private PersonRepository repo;

    private static PersonServiceImplementation service = null;
    //private PersonRepository repo;

    private PersonServiceImplementation()
    {
     //   this.repo = PersonRepositoryImplementation.getRepository();
    }

    public static PersonServiceImplementation getService()
    {
        if(service == null) service = new PersonServiceImplementation();
        return service;
    }

    @Override
    public Person retrieveById(String id) {
        List<Person> churches = getAll();
        for(Person c: churches)
        {
            if (c.getpName().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<Person> getAll() {
        return this.repo.findAll();
    }

    @Override
    public Person create(Person person) {
        return this.repo.save(person);
    }

    @Override
    public Person read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public Person update(Person person) {
        return this.repo.save(person);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
