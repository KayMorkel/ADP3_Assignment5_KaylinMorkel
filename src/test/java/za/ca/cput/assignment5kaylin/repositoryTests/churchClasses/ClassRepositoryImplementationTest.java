//package za.ca.cput.assignment5kaylin.repositoryTests.churchClasses;
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
//import za.ca.cput.assignment5kaylin.domain.churchClasses.Class;
//import za.ca.cput.assignment5kaylin.factory.churchClasses.ClassFactory;
//import za.ca.cput.assignment5kaylin.repository.churchClasses.ClassRepository;
//import za.ca.cput.assignment5kaylin.repository.churchClasses.implementations.ClassRepositoryImplementation;
//
//import java.util.Set;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class ClassRepositoryImplementationTest
//{
//    @Autowired
//    private ClassRepository classRepository;
//    private Set<Class> classes;
//    Class cl;
//    Class c2;
//
//    @Before
//    public void setUp() throws Exception
//    {
//        //this.classRepository = ClassRepositoryImplementation.getRepository();
//    }
//
//    @Test
//    public void l_create()
//    {
//        cl = ClassFactory.getClass("BibC1256", 12);
//        c2 = ClassFactory.getClass("BibC1246", 10);
//        Class c = this.classRepository.create(cl);
//        Assert.assertEquals(cl, c);
//        Class cc = this.classRepository.create(c2);
//        Assert.assertEquals(c2, cc);
//    }
//
//    @Test
//    public void m_read()
//    {
//        String s = "BibC1256";
//        Class cl = this.classRepository.read(s);
//
//        Assert.assertEquals(s, cl.getClassId());
//        //return classes.iterator().next();
//        System.out.println(cl.getClassId() + cl.getNumOfStudents());
//    }
//
//    @Test
//    public void n_update()
//    {
//        cl = ClassFactory.getClass("BibC1246", 12);
//        Class c = this.classRepository.update(cl);
//        Assert.assertEquals(cl, c);
//        System.out.println(c.getClassId() + "\n"+c.getNumOfStudents());
//    }
//
//    @Test
//    public void o_delete()
//    {
//        String s = "BibC1256";
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