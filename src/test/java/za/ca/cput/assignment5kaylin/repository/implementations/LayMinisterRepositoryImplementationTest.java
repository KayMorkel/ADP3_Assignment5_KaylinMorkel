package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.LayMinister;
import za.ca.cput.assignment5kaylin.repository.LayMinisterRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class LayMinisterRepositoryImplementationTest {
    private LayMinisterRepository classRepository;
    private Set<LayMinister> classes;
    LayMinister cl;
    LayMinister c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = LayMinisterRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new LayMinister.Builder().id("1").name("Sally").build();
        c2 = new LayMinister.Builder().id("2").name("Merle").build();
        LayMinister c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        LayMinister cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "2";
        LayMinister cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getId());
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new LayMinister.Builder().id("1").name("Sally").build();
        LayMinister c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getId() + "\n"+c.getName());
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