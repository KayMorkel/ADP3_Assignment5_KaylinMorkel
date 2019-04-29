package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.Teacher;
import za.ca.cput.assignment5kaylin.repository.TeacherRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class TeacherRepositoryImplementationTest {
    private TeacherRepository classRepository;
    private Set<Teacher> classes;
    Teacher cl;
    Teacher c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = TeacherRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new Teacher.Builder().id("1").type("BibleClass").build();
        c2 = new Teacher.Builder().id("2").type("ConfirmationClass").build();
        Teacher c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        Teacher cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "2";
        Teacher cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getId());
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new Teacher.Builder().id("1").type("Bibleclass").build();
        Teacher c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getId() + "\n"+c.getType());
    }

    @Test
    public void delete()
    {
        String s = "1";
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