package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.FrailGoer;
import za.ca.cput.assignment5kaylin.repository.FrailGoerRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class FrailGoerRepositoryImplementationTest {
    private FrailGoerRepository classRepository;
    private Set<FrailGoer> classes;
    FrailGoer cl;
    FrailGoer c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = FrailGoerRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new FrailGoer.Builder().frailNum("1").type("Old age").build();
        c2 = new FrailGoer.Builder().frailNum("2").type("Old age").build();
        FrailGoer c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        FrailGoer cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "1";
        FrailGoer cl = this.classRepository.read(s);

        Assert.assertEquals(null, cl);
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new FrailGoer.Builder().frailNum("2").type("Old age").build();
        FrailGoer c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getFrailNum() + "\n"+c.getType());
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