package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.Person;
import za.ca.cput.assignment5kaylin.repository.PersonRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class PersonRepositoryImplementationTest {
    private PersonRepository classRepository;
    private Set<Person> classes;
    Person cl;
    Person c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = PersonRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new Person.Builder().pName("Kel").pTelNumber("0219529886").build();
        c2 = new Person.Builder().pName("Mel").pTelNumber("0219529786").build();
        Person c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        Person cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "Kel";
        Person cl = this.classRepository.read(s);

        Assert.assertEquals(null, cl);
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new Person.Builder().pName("Kel").pTelNumber("0219529886").build();
        Person c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getpName() + "\n"+c.getpTelNumber());
    }

    @Test
    public void delete()
    {
        String s = "Kel";
        this.classRepository.delete(s);
        classes = this.classRepository.getAll();
        int size = classes.size();
        Assert.assertEquals(1, size);
    }

    @Test
    public void getAll()
    {
        classes = this.classRepository.getAll();
        Assert.assertEquals(1, classes.size());

        System.out.println(classes.size());
    }
}