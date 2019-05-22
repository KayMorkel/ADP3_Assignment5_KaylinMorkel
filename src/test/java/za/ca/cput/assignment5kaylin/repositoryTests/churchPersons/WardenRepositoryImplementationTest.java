package za.ca.cput.assignment5kaylin.repositoryTests.churchPersons;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Warden;
import za.ca.cput.assignment5kaylin.factory.churchPersons.WardenFactory;
import za.ca.cput.assignment5kaylin.repository.churchPersons.WardenRepository;
import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.WardenRepositoryImplementation;

import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WardenRepositoryImplementationTest
{
    @Autowired
    private WardenRepository classRepository;
    private Set<Warden> classes;
    Warden cl;
    Warden c2;

    @Before
    public void setUp() throws Exception
    {
        //this.classRepository = WardenRepositoryImplementation.getRepository();
    }

    @Test
    public void l_create()
    {
        cl = WardenFactory.getWarden( "Earle", "02165894632");
        c2 = WardenFactory.getWarden("Merle", "02165894152");
        Warden c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        Warden cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void m_read()
    {
        String s = "Merle";
        Warden cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getWardenName());
        //return classes.iterator().next();
        System.out.println(cl.getWardenName() + " " + cl.getWardenTelNumber());
    }

    @Test
    public void n_update()
    {
        cl = WardenFactory.getWarden("Earle", "02165894631");
        Warden c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getWardenName() + "\n"+c.getWardenTelNumber());
    }

    @Test
    public void o_delete()
    {
        String s = "Earle";
        this.classRepository.delete(s);
        classes = this.classRepository.getAll();
        int size = classes.size();
        Assert.assertEquals(1, size);
    }

    @Test
    public void p_getAll()
    {
        classes = this.classRepository.getAll();
        Assert.assertEquals(1, classes.size());

        System.out.println(classes.size());
    }
}