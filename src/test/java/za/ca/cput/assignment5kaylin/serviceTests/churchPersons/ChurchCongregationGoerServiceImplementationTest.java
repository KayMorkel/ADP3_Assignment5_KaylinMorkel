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
//import za.ca.cput.assignment5kaylin.domain.churchPersons.ChurchCongregationGoer;
//import za.ca.cput.assignment5kaylin.factory.churchPersons.ChurchCongregationGoerFactory;
//import za.ca.cput.assignment5kaylin.service.churchPersons.implementation.ChurchCongregationGoerServiceImplementation;
//
//import java.util.Set;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class ChurchCongregationGoerServiceImplementationTest
//{
//    @Autowired
//    private ChurchCongregationGoerServiceImplementation service;
//    private Set<ChurchCongregationGoer> classes;
//    ChurchCongregationGoer cl;
//    ChurchCongregationGoer c2;
//
//    @Before
//    public void setUp() throws Exception {
//        //this.classRepository = ChurchCongregationGoerRepositoryImplementation.getRepository();
//    }
//
//    @Test
//    public void l_create() {
//        cl = ChurchCongregationGoerFactory.getCongGoer("265", "StandardGoer");
//        c2 = ChurchCongregationGoerFactory.getCongGoer("200", "DeceasedGoer");
//        ChurchCongregationGoer c = this.service.create(cl);
//        Assert.assertEquals(cl, c);
//        ChurchCongregationGoer cc = this.service.create(c2);
//        Assert.assertEquals(c2, cc);
//    }
//
//    @Test
//    public void m_read() {
//        String s = "265";
//        ChurchCongregationGoer cl = this.service.read(s);
//
//        Assert.assertEquals(s, cl.getGoerId());
//        //return classes.iterator().next();
//        System.out.println(cl.getGoerId() + " " + cl.getGoerType());
//    }
//
//    @Test
//    public void n_update()
//    {
//        cl = ChurchCongregationGoerFactory.getCongGoer("200", "FrailGoer");
//        ChurchCongregationGoer c = this.service.update(cl);
//        Assert.assertEquals(cl, c);
//        System.out.println(c.getGoerId() + "\n"+c.getGoerType());
//    }
//
//    @Test
//    public void o_delete()
//    {
//        String s = "265";
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
