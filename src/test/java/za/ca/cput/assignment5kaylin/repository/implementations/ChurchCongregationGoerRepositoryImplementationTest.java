package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.ChurchCongregationGoer;
import za.ca.cput.assignment5kaylin.repository.ChurchCongregationGoerRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class ChurchCongregationGoerRepositoryImplementationTest {

    private ChurchCongregationGoerRepository classRepository;
    private Set<ChurchCongregationGoer> classes;
    ChurchCongregationGoer cl;
    ChurchCongregationGoer c2;

    @Before
    public void setUp() throws Exception {
        this.classRepository = ChurchCongregationGoerRepositoryImplementation.getRepository();
    }

    @Test
    public void create() {
        cl = new ChurchCongregationGoer.Builder().goerId("265").goerType("StandardGoer").build();
        c2 = new ChurchCongregationGoer.Builder().goerId("200").goerType("DeceasedGoer").build();
        ChurchCongregationGoer c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        ChurchCongregationGoer cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read() {
        String s = "265";
        ChurchCongregationGoer cl = this.classRepository.read(s);

        Assert.assertEquals(null, cl);
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new ChurchCongregationGoer.Builder().goerId("200").goerType("DeceasedGoer").build();
        ChurchCongregationGoer c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getGoerId() + "\n"+c.getGoerType());
    }

    @Test
    public void delete()
    {
        String s = "265";
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