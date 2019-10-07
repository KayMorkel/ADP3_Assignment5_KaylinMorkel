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
//import za.ca.cput.assignment5kaylin.domain.churchPersons.Priest;
//import za.ca.cput.assignment5kaylin.factory.churchPersons.PriestFactory;
//import za.ca.cput.assignment5kaylin.service.churchPersons.implementation.PriestServiceImplementation;
//
//import java.util.Set;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class PriestServiceImplementationTest
//{
//    @Autowired
//    private PriestServiceImplementation service;
//    private Set<Priest> classes;
//    Priest cl;
//    Priest c2;
//
//    @Before
//    public void setUp() throws Exception
//    {
//        //this.classRepository = PriestRepositoryImplementation.getRepository();
//    }
//
//    @Test
//    public void l_create()
//    {
//        cl = PriestFactory.getPriest("2000", "1996/08/09");
//        c2 = PriestFactory.getPriest("3000", "2000/08/09");
//        Priest c = this.service.create(cl);
//        Assert.assertEquals(cl, c);
//        Priest cc = this.service.create(c2);
//        Assert.assertEquals(c2, cc);
//    }
//
//    @Test
//    public void m_read()
//    {
//        String s = "3000";
//        Priest cl = this.service.read(s);
//
//        Assert.assertEquals(s, cl.getSal());
//        //return classes.iterator().next();
//        System.out.println(cl.getSal() + " " + cl.getInductDate());
//    }
//
//    @Test
//    public void n_update()
//    {
//        cl = PriestFactory.getPriest("2000", "1996/08/09");
//        Priest c = this.service.update(cl);
//        Assert.assertEquals(cl, c);
//        System.out.println(c.getInductDate() + "\n"+c.getSal());
//    }
//
//    @Test
//    public void o_delete()
//    {
//        String s = "3000";
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
