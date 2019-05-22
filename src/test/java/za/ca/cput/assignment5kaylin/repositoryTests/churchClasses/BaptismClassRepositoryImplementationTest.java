package za.ca.cput.assignment5kaylin.repositoryTests.churchClasses;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ca.cput.assignment5kaylin.domain.churchClasses.BaptismClass;
import za.ca.cput.assignment5kaylin.factory.churchClasses.BaptismClassFactory;
import za.ca.cput.assignment5kaylin.repository.churchClasses.BaptismClassRepository;
import za.ca.cput.assignment5kaylin.repository.churchClasses.implementations.BaptismClassRepositoryImplementation;

import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BaptismClassRepositoryImplementationTest
{
    @Autowired
    private BaptismClassRepository baprep;
    private Set<BaptismClass> classes;
    BaptismClass c1;
    BaptismClass c2;

    @Before
    public void setUp() throws Exception {
        //this.baprep = BaptismClassRepositoryImplementation.getRepository();
    }

    @Test
    public void l_create()
    {
        c1 = BaptismClassFactory.getBapClass("SC25", "08:15");
        c2 = BaptismClassFactory.getBapClass("BC25", "16:00");
        BaptismClass c = this.baprep.create(c1);
        Assert.assertEquals(c1, c);
        BaptismClass cc = this.baprep.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void m_read()
    {
        String s = "BC25";
        BaptismClass c1 = this.baprep.read(s);

        Assert.assertEquals(s, c1.getClassNo());
        System.out.println(c1.getClassNo() + c1.getClassTime());
    }

    @Test
    public void n_update()
    {
        c1 = BaptismClassFactory.getBapClass("SC25", "08:15");
        BaptismClass c = this.baprep.update(c1);
        Assert.assertEquals(c1, c);
        System.out.println(c.getClassNo() + "\n" +c.getClassTime());
    }

    @Test
    public void o_delete()
    {
        String s = "SC25";
        this.baprep.delete(s);
        classes = this.baprep.getAll();
        int size = classes.size();
        Assert.assertEquals(1, size);
    }

    @Test
    public void p_getAll()
    {
        classes = this.baprep.getAll();
        Assert.assertEquals(1, classes.size());

        System.out.println(classes.size());
    }
}