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
import za.ca.cput.assignment5kaylin.domain.churchPersons.FrailGoer;
import za.ca.cput.assignment5kaylin.factory.churchPersons.FrailGoerFactory;
import za.ca.cput.assignment5kaylin.service.churchPersons.implementation.FrailGoerServiceImplementation;

import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FrailGoerServiceImplementationTest
{
    @Autowired
    private FrailGoerServiceImplementation service;
    private Set<FrailGoer> classes;
    FrailGoer cl;
    FrailGoer c2;

    @Before
    public void setUp() throws Exception
    {
        //this.classRepository = FrailGoerRepositoryImplementation.getRepository();
    }

    @Test
    public void l_create()
    {
        cl = FrailGoerFactory.getFrailP( "1", "Old age");
        c2 = FrailGoerFactory.getFrailP("2", "Old age");
        FrailGoer c = this.service.create(cl);
        Assert.assertEquals(cl, c);
        FrailGoer cc = this.service.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void m_read()
    {
        String s = "1";
        FrailGoer cl = this.service.read(s);

        Assert.assertEquals(s, cl.getFrailNum());
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void n_update()
    {
        cl = FrailGoerFactory.getFrailP("2", "Old age");
        FrailGoer c = this.service.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getFrailNum() + "\n"+c.getType());
    }

    @Test
    public void o_delete()
    {
        String s = "1";
        this.service.delete(s);
        classes = this.service.getAll();
        int size = classes.size();
        Assert.assertEquals(1, size);
    }

    @Test
    public void p_getAll()
    {
        classes = this.service.getAll();
        Assert.assertEquals(1, classes.size());

        System.out.println(classes.size());
    }
}
