package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.Student;
import za.ca.cput.assignment5kaylin.repository.StudentRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class StudentRepositoryImplementationTest {
    private StudentRepository classRepository;
    private Set<Student> classes;
    Student cl;
    Student c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = StudentRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new Student.Builder().studId("1").studType("BibleClass").build();
        c2 = new Student.Builder().studId("2").studType("ConfirmationClass").build();
        Student c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        Student cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "2";
        Student cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getStudId());
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new Student.Builder().studId("1").studType("BibleClass").build();
        Student c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getStudId() + "\n"+c.getStudType());
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