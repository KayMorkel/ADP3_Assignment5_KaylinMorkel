//package za.ca.cput.assignment5kaylin.serviceTests.churchPersons;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.MethodSorters;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import za.ca.cput.assignment5kaylin.domain.churchPersons.Student;
//import za.ca.cput.assignment5kaylin.factory.churchPersons.StudentFactory;
//import za.ca.cput.assignment5kaylin.service.churchPersons.implementation.StudentServiceImplementation;
//
//import java.util.Set;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class StudentServiceImplementationTest
//{
//    @Autowired
//    private StudentServiceImplementation service;
//    private Set<Student> classes;
//    Student cl;
//    Student c2;
//
//    @Before
//    public void setUp() throws Exception
//    {
//        //this.classRepository = StudentRepositoryImplementation.getRepository();
//    }
//
//    @Test
//    public void l_create()
//    {
//        cl = StudentFactory.getStudent( "1", "BibleClass");
//        c2 = StudentFactory.getStudent("2", "ConfirmationClass");
//        Student c = this.service.create(cl);
//        Assert.assertEquals(cl, c);
//        Student cc = this.service.create(c2);
//        Assert.assertEquals(c2, cc);
//    }
//
//    @Test
//    public void m_read()
//    {
//        String s = "2";
//        Student cl = this.service.read(s);
//
//        Assert.assertEquals(s, cl.getStudId());
//        //return classes.iterator().next();
//        System.out.println(cl.getStudId() + " " + cl.getStudType());
//    }
//
//    @Test
//    public void n_update()
//    {
//        cl = StudentFactory.getStudent("1", "SundaySchool");
//        Student c = this.service.update(cl);
//        Assert.assertEquals(cl, c);
//        System.out.println(c.getStudId() + "\n"+c.getStudType());
//    }
//
//    @Test
//    public void o_delete()
//    {
//        String s = "1";
//        this.service.delete(s);
//        classes = this.service.getAll();
//        int size = classes.size();
//        Assert.assertEquals(classes.size(), size);
//    }
//
//    @Test
//    public void p_getAll()
//    {
//        classes = this.service.getAll();
//        Assert.assertEquals(2, classes.size());
//
//        System.out.println(classes.size());
//    }
//}
