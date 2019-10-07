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
//import za.ca.cput.assignment5kaylin.domain.churchPersons.MarriedGoer;
//import za.ca.cput.assignment5kaylin.factory.churchPersons.MarriedGoerFactory;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.MarriedGoerRepository;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.MarriedGoerRepositoryImplementation;
//
//import java.util.Set;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class MarriedGoerRepositoryImplementationTest
//{
//    @Autowired
//    private MarriedGoerRepository classRepository;
//    private Set<MarriedGoer> classes;
//    MarriedGoer cl;
//    MarriedGoer c2;
//
//    @Before
//    public void setUp() throws Exception
//    {
//        //this.classRepository = MarriedGoerRepositoryImplementation.getRepository();
//    }
//
//    @Test
//    public void l_create()
//    {
//        cl = MarriedGoerFactory.getMarried( "1", "2000");
//        c2 = MarriedGoerFactory.getMarried("2", "2001");
//        MarriedGoer c = this.classRepository.create(cl);
//        Assert.assertEquals(cl, c);
//        MarriedGoer cc = this.classRepository.create(c2);
//        Assert.assertEquals(c2, cc);
//    }
//
//    @Test
//    public void m_read()
//    {
//        String s = "2";
//        MarriedGoer cl = this.classRepository.read(s);
//
//        Assert.assertEquals(s, cl.getId());
//        //return classes.iterator().next();
//        System.out.println(cl.getId() + " " + cl.getYearMarried());
//    }
//
//    @Test
//    public void n_update()
//    {
//        cl = MarriedGoerFactory.getMarried("1", "2000");
//        MarriedGoer c = this.classRepository.update(cl);
//        Assert.assertEquals(cl, c);
//        System.out.println(c.getId() + "\n"+c.getYearMarried());
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