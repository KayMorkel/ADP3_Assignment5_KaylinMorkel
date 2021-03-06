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
import za.ca.cput.assignment5kaylin.domain.churchPersons.Teacher;
import za.ca.cput.assignment5kaylin.factory.churchPersons.TeacherFactory;
import za.ca.cput.assignment5kaylin.service.churchPersons.implementation.TeacherServiceImplementation;

import java.util.List;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TeacherServiceImplementationTest
{
    @Autowired
    private TeacherServiceImplementation service;
    private List<Teacher> classes;
    Teacher cl;
    Teacher c2;

    @Before
    public void setUp() throws Exception
    {
        //this.classRepository = TeacherRepositoryImplementation.getRepository();
    }

    @Test
    public void l_create()
    {
        cl = TeacherFactory.getTeacher( "1", "BibleClass");
        c2 = TeacherFactory.getTeacher("2", "ConfirmationClass");
        Teacher c = this.service.create(cl);
        Assert.assertEquals(cl.getId(), c.getId());
        Teacher cc = this.service.create(c2);
        Assert.assertEquals(c2.getId(), cc.getId());
    }

    @Test
    public void m_read()
    {
        String s = "2";
        Teacher cl = this.service.read(s);

        Assert.assertEquals(s, cl.getId());
        //return classes.iterator().next();
        System.out.println(cl.getId() + " " + cl.getType());
    }

    @Test
    public void n_update()
    {
        cl = TeacherFactory.getTeacher("1", "Bibleclass");
        Teacher c = this.service.update(cl);
        Assert.assertEquals(cl.getId(), c.getId());
        System.out.println(c.getId() + "\n"+c.getType());
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
