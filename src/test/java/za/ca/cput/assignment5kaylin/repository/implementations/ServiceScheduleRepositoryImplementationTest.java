package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.ServiceSchedule;
import za.ca.cput.assignment5kaylin.repository.ServiceScheduleRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class ServiceScheduleRepositoryImplementationTest {
    private ServiceScheduleRepository classRepository;
    private Set<ServiceSchedule> classes;
    ServiceSchedule cl;
    ServiceSchedule c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = ServiceScheduleRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new ServiceSchedule.Builder().id("1").type("Easter Sunday").build();
        c2 = new ServiceSchedule.Builder().id("2").type("Sunday Service").build();
        ServiceSchedule c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        ServiceSchedule cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "2";
        ServiceSchedule cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getId());
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new ServiceSchedule.Builder().id("1").type("Easter Sunday").build();
        ServiceSchedule c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getId() + "\n"+c.getType());
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