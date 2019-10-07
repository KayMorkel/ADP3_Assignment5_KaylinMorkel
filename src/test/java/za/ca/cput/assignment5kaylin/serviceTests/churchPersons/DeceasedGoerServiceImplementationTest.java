package za.ca.cput.assignment5kaylin.serviceTests.churchPersons;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ca.cput.assignment5kaylin.domain.churchPersons.DeceasedGoer;
import za.ca.cput.assignment5kaylin.factory.churchPersons.DeceasedGoerFactory;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.DeceasedGoerRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.implementation.DeceasedGoerServiceImplementation;

import java.util.List;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DeceasedGoerServiceImplementationTest
{
    @Autowired
    private DeceasedGoerServiceImplementation service;
    private List<DeceasedGoer> classes;
    DeceasedGoer cl;
    DeceasedGoer c2;

    @Before
    public void setUp() throws Exception
    {
        //this.classRepository = DeceasedGoerRepositoryImplementation.getRepository();
    }

    @Test
    public void l_create()
    {
        cl = DeceasedGoerFactory.getDeceased( "360", "2000");
        c2 = DeceasedGoerFactory.getDeceased("361", "2001");
        DeceasedGoer c = this.service.create(cl);
        Assert.assertEquals(cl.getDecNum(), c.getDecNum());
        DeceasedGoer cc = this.service.create(c2);
        Assert.assertEquals(c2.getDecNum(), cc.getDecNum());
    }

    @Test
    public void m_read()
    {
        String s = "361";
        DeceasedGoer cl = this.service.read(s);

        Assert.assertEquals(s, cl.getDecNum());
        //return classes.iterator().next();
        System.out.println(cl.getDecNum() + " " + cl.getYearDied());
    }

    @Test
    public void n_update()
    {
        cl = DeceasedGoerFactory.getDeceased("361", "2002");
        DeceasedGoer c = this.service.update(cl);
        Assert.assertEquals(cl.getDecNum(), c.getDecNum());
        System.out.println(c.getDecNum() + "\n"+c.getYearDied());
    }

    @Test
    public void o_delete()
    {
        String s = "360";
        this.service.delete(s);
        classes = this.service.getAll();
        int size = classes.size();
        Assert.assertEquals(classes.size(), size);
    }

    @Test
    public void p_getAll()
    {
        classes = this.service.getAll();
        Assert.assertEquals(2, classes.size());

        System.out.println(classes.size());
    }
}
