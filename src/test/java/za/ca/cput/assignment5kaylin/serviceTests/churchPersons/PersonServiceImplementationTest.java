package za.ca.cput.assignment5kaylin.serviceTests.churchPersons;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Person;
import za.ca.cput.assignment5kaylin.factory.churchPersons.PersonFactory;
import za.ca.cput.assignment5kaylin.service.churchPersons.implementation.PersonServiceImplementation;

import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonServiceImplementationTest
{
    @Autowired
    private PersonServiceImplementation service;
    private Set<Person> classes;
    Person cl;
    Person c2;

    @Before
    public void setUp() throws Exception
    {
        //this.classRepository = PersonRepositoryImplementation.getRepository();
    }

    @Test
    public void l_create()
    {
        cl = PersonFactory.getPerson( "Kel", "0219529886");
        c2 = PersonFactory.getPerson("Mel", "0219529786");
        Person c = this.service.create(cl);
        Assert.assertEquals(cl, c);
        Person cc = this.service.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void m_read()
    {
        String s = "Kel";
        Person cl = this.service.read(s);

        Assert.assertEquals(s, cl.getpName());
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void n_update()
    {
        cl = PersonFactory.getPerson("Kel", "0219529886");
        Person c = this.service.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getpName() + "\n"+c.getpTelNumber());
    }

    @Test
    public void o_delete()
    {
        String s = "Kel";
        this.service.delete(s);
        classes = this.service.getAll();
        int size = classes.size();
        Assert.assertEquals(1, size);
    }

    @Test
    public void p_getAll()
    {
        classes = this.service.getAll();
        Assert.assertEquals(1, classes.size());

        System.out.println(classes.size());
    }
}
