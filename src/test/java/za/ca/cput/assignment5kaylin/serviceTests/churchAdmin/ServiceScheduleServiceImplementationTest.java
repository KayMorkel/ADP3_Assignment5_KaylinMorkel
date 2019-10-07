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
//import za.ca.cput.assignment5kaylin.domain.churchAdmin.ServiceSchedule;
//import za.ca.cput.assignment5kaylin.factory.churchAdmin.ServiceScheduleFactory;
//import za.ca.cput.assignment5kaylin.service.churchAdmin.implementation.ServiceScheduleServiceImplementation;
//
//import java.util.Set;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class ServiceScheduleServiceImplementationTest
//{
//    @Autowired
//    private ServiceScheduleServiceImplementation service;
//    private Set<ServiceSchedule> classes;
//    ServiceSchedule cl;
//    ServiceSchedule c2;
//
//    @Before
//    public void setUp() throws Exception
//    {
//        //this.classRepository = ServiceScheduleRepositoryImplementation.getRepository();
//    }
//
//    @Test
//    public void l_create()
//    {
//        cl = ServiceScheduleFactory.getSS("1", "Easter Sunday");
//        c2 = ServiceScheduleFactory.getSS("2", "Sunday Service");
//        ServiceSchedule c = this.service.create(cl);
//        Assert.assertEquals(cl, c);
//        ServiceSchedule cc = this.service.create(c2);
//        Assert.assertEquals(c2, cc);
//    }
//
//    @Test
//    public void m_read()
//    {
//        String s = "2";
//        ServiceSchedule cl = this.service.read(s);
//
//        Assert.assertEquals(s, cl.getId());
//        //return classes.iterator().next();
//        System.out.println(cl.getId() + " " + cl.getType());
//    }
//
//    @Test
//    public void n_update()
//    {
//        cl = ServiceScheduleFactory.getSS("1", "Family Service");
//        ServiceSchedule c = this.service.update(cl);
//        Assert.assertEquals(cl, c);
//        System.out.println(c.getId() + "\n"+c.getType());
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
