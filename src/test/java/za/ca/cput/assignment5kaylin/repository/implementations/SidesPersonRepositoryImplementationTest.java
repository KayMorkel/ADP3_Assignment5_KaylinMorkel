package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.SidesPerson;
import za.ca.cput.assignment5kaylin.repository.SidesPersonRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class SidesPersonRepositoryImplementationTest {
    private SidesPersonRepository classRepository;
    private Set<SidesPerson> classes;
    SidesPerson cl;
    SidesPerson c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = SidesPersonRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new SidesPerson.Builder().sal("2000").payType("Weekly").build();
        c2 = new SidesPerson.Builder().sal("3000").payType("Monthly").build();
        SidesPerson c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        SidesPerson cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "3000";
        SidesPerson cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getSal());
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl =  new SidesPerson.Builder().sal("2000").payType("Weekly").build();
        SidesPerson c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getSal() + "\n"+c.getPayType());
    }

    @Test
    public void delete()
    {
        String s = "2000";
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