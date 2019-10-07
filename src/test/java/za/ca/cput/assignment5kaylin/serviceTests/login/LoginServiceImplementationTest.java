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
//import za.ca.cput.assignment5kaylin.domain.login.Login;
//import za.ca.cput.assignment5kaylin.factory.login.LoginFactory;
//import za.ca.cput.assignment5kaylin.service.login.implementation.LoginServiceImplementation;
//
//import java.util.Set;
//
//import static org.junit.Assert.assertEquals;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class LoginServiceImplementationTest
//{
//    @Autowired
//    private LoginServiceImplementation service;
//    private Set<Login> classes;
//    Login cl;
//    Login c2;
//
//    @Before
//    public void setUp() throws Exception
//    {
//        //this.classRepository = LoginRepositoryImplementation.getRepository();
//    }
//
//    @Test
//    public void l_create()
//    {
//        cl = LoginFactory.getLogin("kelMer12", "joenma");
//        c2 = LoginFactory.getLogin("ldojj", "djkkhbk");
//        Login c = this.service.create(cl);
//        assertEquals(cl, c);
//        Login cc = this.service.create(c2);
//        assertEquals(c2, cc);
//    }
//
//    @Test
//    public void m_read()
//    {
//        String s = "kelMer12";
//        Login cjk = this.service.read(s);
//
//        assertEquals(s, cjk.getUsername());
//        //return classes.iterator().next();
//        System.out.println(cjk);
//    }
//
//    @Test
//    public void n_update()
//    {
//        cl = LoginFactory.getLogin("kelMer12", "joenma");
//        Login c = this.service.update(cl);
//        assertEquals(cl, c);
//        System.out.println(c.getUsername() + "\n"+c.getPassword());
//    }
//
//    @Test
//    public void o_delete()
//    {
//        String s = "kelMer12";
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
