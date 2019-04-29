package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.UsageOfMoney;
import za.ca.cput.assignment5kaylin.repository.UsageOfMoneyRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class UsageOfMoneyRepositoryImplementationTest {
    private UsageOfMoneyRepository classRepository;
    private Set<UsageOfMoney> classes;
    UsageOfMoney cl;
    UsageOfMoney c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = UsageOfMoneyRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new UsageOfMoney.Builder().id("1").usedFor("Electricity").build();
        c2 = new UsageOfMoney.Builder().id("2").usedFor("Repairs").build();
        UsageOfMoney c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        UsageOfMoney cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "2";
        UsageOfMoney cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getId());
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new UsageOfMoney.Builder().id("1").usedFor("Electricity").build();
        UsageOfMoney c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getId() + "\n"+c.getUsedFor());
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