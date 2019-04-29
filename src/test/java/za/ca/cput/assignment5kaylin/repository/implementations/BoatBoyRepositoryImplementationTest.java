package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.BoatBoy;
import za.ca.cput.assignment5kaylin.repository.BoatBoyRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class BoatBoyRepositoryImplementationTest
{
    private BoatBoyRepository classRepository;
    private Set<BoatBoy> classes;
    BoatBoy cl;
    BoatBoy c2;

    @Before
    public void setUp() throws Exception {
        this.classRepository = BoatBoyRepositoryImplementation.getRepository();
    }

    @Test
    public void create() {
        cl = new BoatBoy.Builder().sal("2000").payType("Weekly").build();
        c2 = new BoatBoy.Builder().sal("3000").payType("Monthly").build();
        BoatBoy c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        BoatBoy cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read() {
        String s = "Weekly";
        BoatBoy cl = this.classRepository.read(s);

        Assert.assertEquals(null, cl);
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update() {
        cl = new BoatBoy.Builder().sal("2000").payType("Weekly").build();
        BoatBoy c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getSal() + "\n"+c.getPayType());
    }

    @Test
    public void delete() {
        String s = "2000";
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