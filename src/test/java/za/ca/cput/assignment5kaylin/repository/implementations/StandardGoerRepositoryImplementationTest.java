package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.StandardGoer;
import za.ca.cput.assignment5kaylin.repository.StandardGoerRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class StandardGoerRepositoryImplementationTest {
    private StandardGoerRepository classRepository;
    private Set<StandardGoer> classes;
    StandardGoer cl;
    StandardGoer c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = StandardGoerRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new StandardGoer.Builder().pledger("yes").build();
        c2 = new StandardGoer.Builder().pledger("no").build();
        StandardGoer c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        StandardGoer cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "no";
        StandardGoer cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getPledger());
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new StandardGoer.Builder().pledger("yes").build();
        StandardGoer c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getPledger());
    }

    @Test
    public void delete()
    {
        String s = "yes";
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