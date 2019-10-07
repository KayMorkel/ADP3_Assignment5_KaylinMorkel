package za.ca.cput.assignment5kaylin.serviceTests.churchAdmin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.HallBooking;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.HallBookingFactory;
import za.ca.cput.assignment5kaylin.service.churchAdmin.implementation.HallBookingServiceImplementation;

import java.util.List;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HallBookingServiceImplementationTest
{
    @Autowired
    private HallBookingServiceImplementation service;
    private List<HallBooking> classes;
    HallBooking cl;
    HallBooking c2;

    @Before
    public void setUp() throws Exception
    {
        //this.classRepository = HallBookingRepositoryImplementation.getRepository();
    }

    @Test
    public void l_create()
    {
        cl = HallBookingFactory.getBooking("1", "Birthday");
        c2 = HallBookingFactory.getBooking("2", "Birthday");
        HallBooking c = this.service.create(cl);
        Assert.assertEquals(cl.getHallBookId(), c.getHallBookId());
        HallBooking cc = this.service.create(c2);
        Assert.assertEquals(c2.getHallBookId(), cc.getHallBookId());
    }

    @Test
    public void m_read()
    {
        String s = "1";
        HallBooking cl = this.service.read(s);

        Assert.assertEquals(s, cl.getHallBookId());
        //return classes.iterator().next();
        System.out.println(cl.getHallBookId() + " " + cl.getEventType());
    }

    @Test
    public void n_update()
    {
        cl = HallBookingFactory.getBooking("1", "21st Party");
        HallBooking c = this.service.update(cl);
        Assert.assertEquals(cl.getHallBookId(), c.getHallBookId());
        System.out.println(c.getHallBookId() + "\n"+c.getEventType());
    }

    @Test
    public void o_delete()
    {
        String s = "1";
        this.service.delete(s);
        classes = this.service.getAll();
        int size = classes.size();
        Assert.assertEquals(classes.size(), size);
    }

    @Test
    public void p_getAll()
    {
        classes = this.service.getAll();
        Assert.assertEquals(1, classes.size());

        System.out.println(classes.size());
    }
}
