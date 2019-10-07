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
//import za.ca.cput.assignment5kaylin.domain.churchClasses.ConfirmationClass;
//import za.ca.cput.assignment5kaylin.factory.churchClasses.ConfirmationClassFactory;
//import za.ca.cput.assignment5kaylin.repository.churchClasses.ConfirmationClassRepository;
//import za.ca.cput.assignment5kaylin.repository.churchClasses.implementations.ConfirmationClassRepositoryImplementation;
//
//import java.util.Set;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class ConfirmationClassRepositoryImplementationTest
//{
//    @Autowired
//    private ConfirmationClassRepository classRepository;
//    private Set<ConfirmationClass> classes;
//    ConfirmationClass cl;
//    ConfirmationClass c2;
//
//    @Before
//    public void setUp() throws Exception
//    {
//        //this.classRepository = ConfirmationClassRepositoryImplementation.getRepository();
//    }
//
//    @Test
//    public void l_create()
//    {
//        cl = ConfirmationClassFactory.getBapClass("25", "22:00");
//        c2 = ConfirmationClassFactory.getBapClass("22", "22:30");
//        ConfirmationClass c = this.classRepository.create(cl);
//        Assert.assertEquals(cl, c);
//        ConfirmationClass cc = this.classRepository.create(c2);
//        Assert.assertEquals(c2, cc);
//    }
//
//    @Test
//    public void m_read()
//    {
//        String s = "22";
//        ConfirmationClass cl = this.classRepository.read(s);
//
//        Assert.assertEquals(s, cl.getClassNo());
//        //return classes.iterator().next();
//        System.out.println(cl.getClassNo()+ cl.getClassTime() );
//    }
//
//    @Test
//    public void n_update()
//    {
//        cl = ConfirmationClassFactory.getBapClass("25", "22:00");
//        ConfirmationClass c = this.classRepository.update(cl);
//        Assert.assertEquals(cl, c);
//        System.out.println(c.getClassNo() + "\n"+c.getClassTime());
//    }
//
//    @Test
//    public void o_delete()
//    {
//        String s = "25";
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