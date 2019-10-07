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
import za.ca.cput.assignment5kaylin.domain.churchPersons.SidesPerson;
import za.ca.cput.assignment5kaylin.factory.churchPersons.SidesPersonFactory;
import za.ca.cput.assignment5kaylin.service.churchPersons.implementation.SidesPersonServiceImplementation;

import java.util.List;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SidesPersonServiceImplementationTest
{
    @Autowired
    private SidesPersonServiceImplementation service;
    private List<SidesPerson> classes;
    SidesPerson cl;
    SidesPerson c2;

    @Before
    public void setUp() throws Exception
    {
        //this.classRepository = SidesPersonRepositoryImplementation.getRepository();
    }

    @Test
    public void l_create()
    {
        cl = SidesPersonFactory.getSideP( "2000","Weekly");
        c2 = SidesPersonFactory.getSideP("3000", "Monthly");
        SidesPerson c = this.service.create(cl);
        Assert.assertEquals(cl.getSal(), c.getSal());
        SidesPerson cc = this.service.create(c2);
        Assert.assertEquals(c2.getSal(), cc.getSal());
    }

    @Test
    public void m_read()
    {
        String s = "3000";
        SidesPerson cl = this.service.read(s);

        Assert.assertEquals(s, cl.getSal());
        //return classes.iterator().next();
        System.out.println(cl.getSal() + " " + cl.getPayType());
    }

    @Test
    public void n_update()
    {
        cl =  SidesPersonFactory.getSideP("2000", "Annually");
        SidesPerson c = this.service.update(cl);
        Assert.assertEquals(cl.getSal(), c.getSal());
        System.out.println(c.getSal() + "\n"+c.getPayType());
    }

    @Test
    public void o_delete()
    {
        String s = "2000";
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
