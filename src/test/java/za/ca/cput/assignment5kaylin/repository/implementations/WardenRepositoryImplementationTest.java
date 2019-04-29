package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.Warden;
import za.ca.cput.assignment5kaylin.repository.WardenRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class WardenRepositoryImplementationTest {
    private WardenRepository classRepository;
    private Set<Warden> classes;
    Warden cl;
    Warden c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = WardenRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new Warden.Builder().wardenName("Earle").wardenTelNumber("02165894632").build();
        c2 = new Warden.Builder().wardenName("Merle").wardenTelNumber("02165894152").build();
        Warden c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        Warden cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "Merle";
        Warden cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getWardenName());
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new Warden.Builder().wardenName("Earle").wardenTelNumber("02165894632").build();
        Warden c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getWardenName() + "\n"+c.getWardenTelNumber());
    }

    @Test
    public void delete()
    {
        String s = "Earle";
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