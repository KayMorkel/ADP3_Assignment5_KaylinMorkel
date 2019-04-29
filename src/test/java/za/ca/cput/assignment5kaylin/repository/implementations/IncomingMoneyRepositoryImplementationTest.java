package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.IncomingMoney;
import za.ca.cput.assignment5kaylin.repository.IncomingMoneyRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class IncomingMoneyRepositoryImplementationTest {
    private IncomingMoneyRepository classRepository;
    private Set<IncomingMoney> classes;
    IncomingMoney cl;
    IncomingMoney c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = IncomingMoneyRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new IncomingMoney.Builder().id("1").from("Fundraiser").build();
        c2 = new IncomingMoney.Builder().id("2").from("Fundraiser").build();
        IncomingMoney c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        IncomingMoney cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "1";
        IncomingMoney cl = this.classRepository.read(s);

        Assert.assertEquals(null, cl);
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new IncomingMoney.Builder().id("2").from("Fundraiser").build();
        IncomingMoney c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getId() + "\n"+c.getFrom());
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