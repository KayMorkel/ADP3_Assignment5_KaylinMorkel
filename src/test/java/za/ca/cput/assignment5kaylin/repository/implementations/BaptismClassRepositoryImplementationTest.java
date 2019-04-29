package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.BaptismClass;
import za.ca.cput.assignment5kaylin.repository.BaptismClassRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class BaptismClassRepositoryImplementationTest
{
    private BaptismClassRepository baprep;
    private Set<BaptismClass> classes;
    BaptismClass c1;
    BaptismClass c2;

    @Before
    public void setUp() throws Exception {
        this.baprep = BaptismClassRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        c1 = new BaptismClass.Builder().classNo("SC25").classTime("08:15").build();
        c2 = new BaptismClass.Builder().classNo("BC25").classTime("16:00").build();
        BaptismClass c = this.baprep.create(c1);
        Assert.assertEquals(c1, c);
        BaptismClass cc = this.baprep.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "BC25";
        BaptismClass c1 = this.baprep.read(s);

        Assert.assertEquals(s, c1.getClassNo());
        System.out.println(c1);
    }

    @Test
    public void update()
    {
        c1 = new BaptismClass.Builder().classNo("SC25").classTime("08:15").build();
        BaptismClass c = this.baprep.update(c1);
        Assert.assertEquals(c1, c);
        System.out.println(c.getClassNo() + "\n" +c.getClassTime());
    }

    @Test
    public void delete()
    {
        String s = "SC25";
        this.baprep.delete(s);
        classes = this.baprep.getAll();
        int size = classes.size();
        Assert.assertEquals(1, size);
    }

    @Test
    public void getAll()
    {
        classes = this.baprep.getAll();
        Assert.assertEquals(1, classes.size());

        System.out.println(classes.size());
    }
}