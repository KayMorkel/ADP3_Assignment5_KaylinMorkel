package za.ca.cput.assignment5kaylin.serviceTests.churchClasses;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ca.cput.assignment5kaylin.domain.churchClasses.SundaySchool;
import za.ca.cput.assignment5kaylin.factory.churchClasses.SundaySchoolFactory;
import za.ca.cput.assignment5kaylin.service.churchClasses.implementation.SundaySchoolServiceImplementation;

import java.util.List;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SundaySchoolServiceImplementationTest
{
    @Autowired
    private SundaySchoolServiceImplementation service;
    private List<SundaySchool> classes;
    SundaySchool cl;
    SundaySchool c2;

    @Before
    public void setUp() throws Exception
    {
        //this.classRepository = SundaySchoolRepositoryImplmentation.getRepository();
    }

    @Test
    public void l_create()
    {
        cl = SundaySchoolFactory.getSunSchool("1");
        c2 = SundaySchoolFactory.getSunSchool("2");
        SundaySchool c = this.service.create(cl);
        Assert.assertEquals(cl.getClassNo(), c.getClassNo());
        SundaySchool cc = this.service.create(c2);
        Assert.assertEquals(c2.getClassNo(), cc.getClassNo());
    }

    @Test
    public void m_read()
    {
        String s = "2";
        SundaySchool cl = this.service.read(s);

        Assert.assertEquals(s, cl.getClassNo());
        //return classes.iterator().next();
        System.out.println(cl.getClassNo());
    }

    @Test
    public void n_update()
    {
        cl = SundaySchoolFactory.getSunSchool("1");
        SundaySchool c = this.service.update(cl);
        Assert.assertEquals(cl.getClassNo(), c.getClassNo());
        System.out.println(c.getClassNo());
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
        Assert.assertEquals(1, classes.size());

        System.out.println(classes.size());
    }
}
