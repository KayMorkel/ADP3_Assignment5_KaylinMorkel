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
//import za.ca.cput.assignment5kaylin.domain.churchPersons.DeceasedGoer;
//import za.ca.cput.assignment5kaylin.factory.churchPersons.DeceasedGoerFactory;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.DeceasedGoerRepository;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.DeceasedGoerRepositoryImplementation;
//
//import java.util.Set;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class DeceasedGoerRepositoryImplementationTest
//{
//    @Autowired
//    private DeceasedGoerRepository classRepository;
//    private Set<DeceasedGoer> classes;
//    DeceasedGoer cl;
//    DeceasedGoer c2;
//
//    @Before
//    public void setUp() throws Exception
//    {
//        //this.classRepository = DeceasedGoerRepositoryImplementation.getRepository();
//    }
//
//    @Test
//    public void l_create()
//    {
//        cl = DeceasedGoerFactory.getDeceased( "360", "2000");
//        c2 = DeceasedGoerFactory.getDeceased("361", "2001");
//        DeceasedGoer c = this.classRepository.create(cl);
//        Assert.assertEquals(cl, c);
//        DeceasedGoer cc = this.classRepository.create(c2);
//        Assert.assertEquals(c2, cc);
//    }
//
//    @Test
//    public void m_read()
//    {
//        String s = "361";
//        DeceasedGoer cl = this.classRepository.read(s);
//
//        Assert.assertEquals(s, cl.getDecNum());
//        //return classes.iterator().next();
//        System.out.println(cl.getDecNum() + " " + cl.getYearDied());
//    }
//
//    @Test
//    public void n_update()
//    {
//        cl = DeceasedGoerFactory.getDeceased("361", "2002");
//        DeceasedGoer c = this.classRepository.update(cl);
//        Assert.assertEquals(cl, c);
//        System.out.println(c.getDecNum() + "\n"+c.getYearDied());
//    }
//
//    @Test
//    public void o_delete()
//    {
//        String s = "360";
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