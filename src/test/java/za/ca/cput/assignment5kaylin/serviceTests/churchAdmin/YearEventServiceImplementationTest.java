package za.ca.cput.assignment5kaylin.serviceTests.churchAdmin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.YearEvent;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.YearEventFactory;
import za.ca.cput.assignment5kaylin.service.churchAdmin.implementation.YearEventServiceImplementation;

import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class YearEventServiceImplementationTest
{
    @Autowired
    private YearEventServiceImplementation service;
    private Set<YearEvent> classes;
    YearEvent cl;
    YearEvent c2;

    @Before
    public void setUp() throws Exception
    {
        //this.classRepository = YearEventRepositoryImplementation.getRepository();
    }

    @Test
    public void l_create()
    {
        cl = YearEventFactory.getYearEvent("1", "Family Day");
        c2 = YearEventFactory.getYearEvent("2", "Family Day");
        YearEvent c = this.service.create(cl);
        Assert.assertEquals(cl, c);
        YearEvent cc = this.service.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void m_read()
    {
        String s = "2";
        YearEvent cl = this.service.read(s);

        Assert.assertEquals(s, cl.getEventNum());
        //return classes.iterator().next();
        System.out.println(cl.getEventNum());
    }

    @Test
    public void n_update()
    {
        cl = YearEventFactory.getYearEvent("1", "PotjieKos Competitiion");
        YearEvent c = this.service.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getEventNum() + "\n"+c.getName());
    }

    @Test
    public void o_delete()
    {
        String s = "1";
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
