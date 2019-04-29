package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.ConfirmationClass;
import za.ca.cput.assignment5kaylin.repository.ConfirmationClassRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class ConfirmationClassRepositoryImplementationTest {
    private ConfirmationClassRepository classRepository;
    private Set<ConfirmationClass> classes;
    ConfirmationClass cl;
    ConfirmationClass c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = ConfirmationClassRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new ConfirmationClass.Builder().classNo("25").classTime("22:00").build();
        c2 = new ConfirmationClass.Builder().classNo("22").classTime("22:30").build();
        ConfirmationClass c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        ConfirmationClass cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "22";
        ConfirmationClass cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getClassNo());
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new ConfirmationClass.Builder().classNo("25").classTime("22:00").build();
        ConfirmationClass c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getClassNo() + "\n"+c.getClassTime());
    }

    @Test
    public void delete()
    {
        String s = "25";
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