//package za.ca.cput.assignment5kaylin.serviceTests.churchAdmin;
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
//import za.ca.cput.assignment5kaylin.domain.churchAdmin.IncomingMoney;
//import za.ca.cput.assignment5kaylin.factory.churchAdmin.IncomingMoneyFactory;
//import za.ca.cput.assignment5kaylin.service.churchAdmin.implementation.IncomingMoneyServiceImplementation;
//
//import java.util.Set;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class IncomingMoneyServiceImplementationTest
//{
//    @Autowired
//    private IncomingMoneyServiceImplementation service;
//    private Set<IncomingMoney> classes;
//    IncomingMoney cl;
//    IncomingMoney c2;
//
//    @Before
//    public void setUp() throws Exception
//    {
//        //this.classRepository = IncomingMoneyRepositoryImplementation.getRepository();
//    }
//
//    @Test
//    public void l_create()
//    {
//        cl = IncomingMoneyFactory.getIncMon("1", "Fundraiser");
//        c2 = IncomingMoneyFactory.getIncMon("2", "Fundraiser");
//        IncomingMoney c = this.service.create(cl);
//        Assert.assertEquals(cl, c);
//        IncomingMoney cc = this.service.create(c2);
//        Assert.assertEquals(c2, cc);
//    }
//
//    @Test
//    public void m_read()
//    {
//        String s = "1";
//        IncomingMoney cl = this.service.read(s);
//
//        Assert.assertEquals(s, cl.getId());
//        //return classes.iterator().next();
//        System.out.println(cl.getId() + " " + cl.getFrom());
//    }
//
//    @Test
//    public void n_update()
//    {
//        cl = IncomingMoneyFactory.getIncMon("2", "Family Day");
//        IncomingMoney c = this.service.update(cl);
//        Assert.assertEquals(cl, c);
//        System.out.println(c.getId() + "\n"+c.getFrom());
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
