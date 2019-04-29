package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.HallBooking;
import za.ca.cput.assignment5kaylin.repository.HallBookingRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class HallBookingRepositoryImplementationTest {
    private HallBookingRepository classRepository;
    private Set<HallBooking> classes;
    HallBooking cl;
    HallBooking c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = HallBookingRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new HallBooking.Builder().hallBookId("1").eventType("Birthday").build();
        c2 = new HallBooking.Builder().hallBookId("2").eventType("Birthday").build();
        HallBooking c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        HallBooking cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "1";
        HallBooking cl = this.classRepository.read(s);

        Assert.assertEquals(null, cl);
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new HallBooking.Builder().hallBookId("1").eventType("Birthday").build();
        HallBooking c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getHallBookId() + "\n"+c.getEventType());
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