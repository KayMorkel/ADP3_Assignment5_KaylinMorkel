package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.DeceasedGoer;
import za.ca.cput.assignment5kaylin.repository.DeceasedGoerRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class DeceasedGoerRepositoryImplementationTest {
    private DeceasedGoerRepository classRepository;
    private Set<DeceasedGoer> classes;
    DeceasedGoer cl;
    DeceasedGoer c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = DeceasedGoerRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new DeceasedGoer.Builder().decNum("360").yearDied("2000").build();
        c2 = new DeceasedGoer.Builder().decNum("361").yearDied("2001").build();
        DeceasedGoer c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        DeceasedGoer cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "361";
        DeceasedGoer cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getDecNum());
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new DeceasedGoer.Builder().decNum("361").yearDied("2001").build();
        DeceasedGoer c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getDecNum() + "\n"+c.getYearDied());
    }

    @Test
    public void delete()
    {
        String s = "360";
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