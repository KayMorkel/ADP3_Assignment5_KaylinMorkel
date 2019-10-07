//package za.ca.cput.assignment5kaylin.repositoryTests.churchPersons;
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
//import za.ca.cput.assignment5kaylin.domain.churchPersons.Teacher;
//import za.ca.cput.assignment5kaylin.factory.churchPersons.TeacherFactory;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.TeacherRepository;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.TeacherRepositoryImplementation;
//
//import java.util.Set;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class TeacherRepositoryImplementationTest
//{
//    @Autowired
//    private TeacherRepository classRepository;
//    private Set<Teacher> classes;
//    Teacher cl;
//    Teacher c2;
//
//    @Before
//    public void setUp() throws Exception
//    {
//        //this.classRepository = TeacherRepositoryImplementation.getRepository();
//    }
//
//    @Test
//    public void l_create()
//    {
//        cl = TeacherFactory.getTeacher( "1", "BibleClass");
//        c2 = TeacherFactory.getTeacher("2", "ConfirmationClass");
//        Teacher c = this.classRepository.create(cl);
//        Assert.assertEquals(cl, c);
//        Teacher cc = this.classRepository.create(c2);
//        Assert.assertEquals(c2, cc);
//    }
//
//    @Test
//    public void m_read()
//    {
//        String s = "2";
//        Teacher cl = this.classRepository.read(s);
//
//        Assert.assertEquals(s, cl.getId());
//        //return classes.iterator().next();
//        System.out.println(cl.getId() + " " + cl.getType());
//    }
//
//    @Test
//    public void n_update()
//    {
//        cl = TeacherFactory.getTeacher("1", "Bibleclass");
//        Teacher c = this.classRepository.update(cl);
//        Assert.assertEquals(cl, c);
//        System.out.println(c.getId() + "\n"+c.getType());
//    }
//
//    @Test
//    public void o_delete()
//    {
//        String s = "1";
//        this.classRepository.delete(s);
//        classes = this.classRepository.getAll();
//        int size = classes.size();
//        Assert.assertEquals(1, size);
//    }
//
//    @Test
//    public void p_getAll()
//    {
//        classes = this.classRepository.getAll();
//        Assert.assertEquals(1, classes.size());
//
//        System.out.println(classes.size());
//    }
//}