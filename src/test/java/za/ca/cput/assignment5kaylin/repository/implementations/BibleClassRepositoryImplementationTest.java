package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.BibleClass;
import za.ca.cput.assignment5kaylin.repository.BibleClassRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class BibleClassRepositoryImplementationTest {

    private BibleClassRepository classRepository;
    private Set<BibleClass> classes;
    BibleClass cl;
    BibleClass c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = BibleClassRepositoryImplementation.getRepository();
    }

    @Test
    public void create() {
        cl = new BibleClass.Builder().classNo("BC6").classTime("12:30").build();
        c2 = new BibleClass.Builder().classNo("BC5").classTime("12:30").build();
        BibleClass c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        BibleClass cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read() {
        String s = "BC5";
        BibleClass cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getClassNo());
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update() {
        cl = new BibleClass.Builder().classNo("BC5").classTime("12:30").build();
        BibleClass c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getClassNo() + "\n"+c.getClassTime());
    }

    @Test
    public void delete() {
        String s = "BC6";
        this.classRepository.delete(s);
        classes = this.classRepository.getAll();
        int size = classes.size();
        Assert.assertEquals(1, size);
    }

    @Test
    public void getAll() {
        classes = this.classRepository.getAll();
        Assert.assertEquals(1, classes.size());

        System.out.println(classes.size());
    }
}