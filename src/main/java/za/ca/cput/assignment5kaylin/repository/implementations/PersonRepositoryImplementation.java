package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.Person;
import za.ca.cput.assignment5kaylin.repository.PersonRepository;

import java.util.HashSet;
import java.util.Set;

public class PersonRepositoryImplementation implements PersonRepository
{
    private static PersonRepositoryImplementation classRepository = null;
    private Set<Person> per;

    private PersonRepositoryImplementation()
    {
        this.per = new HashSet<>();
    }

    public static PersonRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new PersonRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Set<Person> getAll() {
        return this.per;
    }

    @Override
    public Person create(Person person) {
        this.per.add(person);
        return person;
    }

    @Override
    public Person read(String s) {
        Person got = null;
        for (Person cla: per){
            if (cla.getpName().equals(s)) {
                System.out.println(cla.getpName() + cla.getpTelNumber());
                got = new Person.Builder().pName(s).pTelNumber(cla.getpTelNumber()).build();
            }
        }

        return got;
    }

    @Override
    public Person update(Person person) {
        if (per.contains(person))
        {
            per.remove(person);
            person = new Person.Builder().pName(person.getpName()).pTelNumber(person.getpTelNumber()).build();
            this.per.add(person);
        }
        //}
        return person;
    }

    @Override
    public void delete(String s) {
        for (Person cla: per)
        {
            if (cla.getpName().equals(s))
            {
                this.per.remove(cla);
            }
        }
    }
}
