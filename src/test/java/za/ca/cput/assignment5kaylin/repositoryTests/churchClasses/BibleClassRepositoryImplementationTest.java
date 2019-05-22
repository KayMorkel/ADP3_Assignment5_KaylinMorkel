package za.ca.cput.assignment5kaylin.repositoryTests.churchClasses;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ca.cput.assignment5kaylin.domain.churchClasses.BibleClass;
import za.ca.cput.assignment5kaylin.factory.churchClasses.BibleClassFactory;
import za.ca.cput.assignment5kaylin.repository.churchClasses.BibleClassRepository;
import za.ca.cput.assignment5kaylin.repository.churchClasses.implementations.BibleClassRepositoryImplementation;

import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BibleClassRepositoryImplementationTest
{
    @Autowired
    private BibleClassRepository classRepository;
    private Set<BibleClass> classes;
    BibleClass cl;
    BibleClass c2;

    @Before
    public void setUp() throws Exception
    {
        //this.classRepository = BibleClassRepositoryImplementation.getRepository();
    }

    @Test
    public void l_create() {
        cl = BibleClassFactory.getBibClass("BC6", "12:30");
        c2 = BibleClassFactory.getBibClass("BC5", "12:30");
        BibleClass c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        BibleClass cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void m_read() {
        String s = "BC5";
        BibleClass cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getClassNo());
        //return classes.iterator().next();
        System.out.println(cl.getClassNo() + " " + cl.getClassTime());
    }

    @Test
    public void n_update() {
        cl = BibleClassFactory.getBibClass("BC5", "12:30");
        BibleClass c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getClassNo() + "\n"+c.getClassTime());
    }

    @Test
    public void o_delete() {
        String s = "BC6";
        this.classRepository.delete(s);
        classes = this.classRepository.getAll();
        int size = classes.size();
        Assert.assertEquals(1, size);
    }

    @Test
    public void p_getAll() {
        classes = this.classRepository.getAll();
        Assert.assertEquals(1, classes.size());

        System.out.println(classes.size());
    }
}