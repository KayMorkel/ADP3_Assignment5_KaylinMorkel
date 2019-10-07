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
//import za.ca.cput.assignment5kaylin.domain.churchPersons.StandardGoer;
//import za.ca.cput.assignment5kaylin.factory.churchPersons.StandardGoerFactory;
//import za.ca.cput.assignment5kaylin.service.churchPersons.implementation.StandardGoerServiceImplementation;
//
//import java.util.Set;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class StandardGoerServiceImplementationTest
//{
//    @Autowired
//    private StandardGoerServiceImplementation service;
//    private Set<StandardGoer> classes;
//    StandardGoer cl;
//    StandardGoer c2;
//
//    @Before
//    public void setUp() throws Exception
//    {
//        //this.classRepository = StandardGoerRepositoryImplementation.getRepository();
//    }
//
//    @Test
//    public void l_create()
//    {
//        cl = StandardGoerFactory.getIsPledger( "yes");
//        c2 = StandardGoerFactory.getIsPledger("no");
//        StandardGoer c = this.service.create(cl);
//        Assert.assertEquals(cl, c);
//        StandardGoer cc = this.service.create(c2);
//        Assert.assertEquals(c2, cc);
//    }
//
//    @Test
//    public void m_read()
//    {
//        String s = "no";
//        StandardGoer cl = this.service.read(s);
//
//        Assert.assertEquals(s, cl.getPledger());
//        //return classes.iterator().next();
//        System.out.println(cl.getPledger());
//    }
//
//    @Test
//    public void n_update()
//    {
//        cl = StandardGoerFactory.getIsPledger("yes");
//        StandardGoer c = this.service.update(cl);
//        Assert.assertEquals(cl, c);
//        System.out.println(c.getPledger());
//    }
//
//    @Test
//    public void o_delete()
//    {
//        String s = "yes";
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
