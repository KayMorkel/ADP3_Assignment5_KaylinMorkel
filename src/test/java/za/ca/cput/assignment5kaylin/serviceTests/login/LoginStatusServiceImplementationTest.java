//package za.ca.cput.assignment5kaylin.serviceTests.login;
//
//import org.junit.Before;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.MethodSorters;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import za.ca.cput.assignment5kaylin.domain.login.LoginStatus;
//import za.ca.cput.assignment5kaylin.factory.login.LoginStatusFactory;
//import za.ca.cput.assignment5kaylin.service.login.implementation.LoginStatusServiceImplementation;
//
//import java.util.Set;
//
//import static org.junit.Assert.assertEquals;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class LoginStatusServiceImplementationTest
//{
//    @Autowired
//    private LoginStatusServiceImplementation service;
//    private Set<LoginStatus> classes;
//    LoginStatus cl;
//    LoginStatus c2;
//
//    @Before
//    public void setUp() throws Exception
//    {
//        //this.classRepository = LoginStatusRepositoryImplementation.getRepository();
//    }
//
//    @Test
//    public void l_create()
//    {
//        cl = LoginStatusFactory.getLoginStat( "1", "Offline");
//        c2 = LoginStatusFactory.getLoginStat("2", "Online");
//        //LoginStatus c = this.service.create(cl);
//        //assertEquals(cl, c);
//        LoginStatus cc = this.service.create(c2);
//        assertEquals(c2, cc);
//    }
//
//    @Test
//    public void m_read()
//    {
//        String s = "2";
//        LoginStatus cl = this.service.read(s);
//
//        assertEquals(s, cl.getStatNum());
//        //return classes.iterator().next();
//        System.out.println(cl);
//    }
//
//    @Test
//    public void n_update()
//    {
//        cl = LoginStatusFactory.getLoginStat("2", "Offline");
//        LoginStatus c = this.service.update(cl);
//        assertEquals(cl, c);
//        System.out.println(c.getStatNum() + "\n"+c.getStatus());
//    }
//
//    @Test
//    public void o_delete()
//    {
//        String s = "1";
//        this.service.delete(s);
//        classes = this.service.getAll();
//        int size = classes.size();
//        assertEquals(classes.size(), size);
//    }
//
//    @Test
//    public void p_getAll()
//    {
//        classes = this.service.getAll();
//        assertEquals(2, classes.size());
//
//        System.out.println(classes.size());
//    }
//}
