/*package za.ca.cput.assignment5kaylin.repository.churchPersons.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Person;
import za.ca.cput.assignment5kaylin.factory.churchPersons.PersonFactory;
import za.ca.cput.assignment5kaylin.repository.churchPersons.PersonRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
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
                System.out.println(cla.getpName() + " " + cla.getpTelNumber());
                got = PersonFactory.getPerson(s, cla.getpTelNumber());
            }
        }

        return got;
    }

    @Override
    public Person update(Person person) {
        if (per.contains(person))
        {
            per.remove(person);
            person = PersonFactory.getPerson(person.getpName(), person.getpTelNumber());
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
                break;
            }
        }
    }
}*/
