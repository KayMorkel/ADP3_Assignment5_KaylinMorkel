package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.Pledge;
import za.ca.cput.assignment5kaylin.repository.PledgeRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class PledgeRepositoryImplementationTest {
    private PledgeRepository classRepository;
    private Set<Pledge> classes;
    Pledge cl;
    Pledge c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = PledgeRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new Pledge.Builder().pledgeNum("1").paymentType("EFT").build();
        c2 = new Pledge.Builder().pledgeNum("2").paymentType("EFT").build();
        Pledge c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        Pledge cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "1";
        Pledge cl = this.classRepository.read(s);

        Assert.assertEquals(null, cl);
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new Pledge.Builder().pledgeNum("1").paymentType("EFT").build();
        Pledge c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getPledgeNum() + "\n"+c.getPaymentType());
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