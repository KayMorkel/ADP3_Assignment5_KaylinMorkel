package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.MarriedGoer;
import za.ca.cput.assignment5kaylin.repository.MarriedGoerRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class MarriedGoerRepositoryImplementationTest {
    private MarriedGoerRepository classRepository;
    private Set<MarriedGoer> classes;
    MarriedGoer cl;
    MarriedGoer c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = MarriedGoerRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new MarriedGoer.Builder().id("1").yearMarried("2000").build();
        c2 = new MarriedGoer.Builder().id("2").yearMarried("2001").build();
        MarriedGoer c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        MarriedGoer cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "2";
        MarriedGoer cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getId());
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new MarriedGoer.Builder().id("1").yearMarried("2000").build();
        MarriedGoer c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getId() + "\n"+c.getYearMarried());
    }

    @Test
    public void delete()
    {
        String s = "1";
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