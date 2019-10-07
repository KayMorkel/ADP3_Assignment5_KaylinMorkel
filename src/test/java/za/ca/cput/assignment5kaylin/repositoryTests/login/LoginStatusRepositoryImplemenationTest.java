//package za.ca.cput.assignment5kaylin.repositoryTests.login;
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
//import za.ca.cput.assignment5kaylin.domain.login.LoginStatus;
//import za.ca.cput.assignment5kaylin.factory.login.LoginStatusFactory;
//import za.ca.cput.assignment5kaylin.repository.login.LoginStatusRepository;
//import za.ca.cput.assignment5kaylin.repository.login.implementations.LoginStatusRepositoryImplementation;
//
//import java.util.Set;
//
//import static org.junit.Assert.assertEquals;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class LoginStatusRepositoryImplemenationTest
//{
//    @Autowired
//    private LoginStatusRepositoryImplementation classRepository;
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
//        //LoginStatus c = this.classRepository.create(cl);
//        //assertEquals(cl, c);
//        LoginStatus cc = this.classRepository.create(c2);
//        assertEquals(c2, cc);
//    }
//
//    @Test
//    public void m_read()
//    {
//        String s = "2";
//        LoginStatus cl = this.classRepository.read(s);
//
//        assertEquals(s, cl.getStatNum());
//        //return classes.iterator().next();
//        System.out.println(cl.getStatNum() + " " + cl.getStatus());
//    }
//
//    @Test
//    public void n_update()
//    {
//        cl = LoginStatusFactory.getLoginStat("1", "Offline");
//        LoginStatus c = this.classRepository.update(cl);
//        assertEquals(cl, c);
//        System.out.println(c.getStatNum() + "\n"+c.getStatus());
//    }
//
//    @Test
//    public void o_delete()
//    {
//        String s = "1";
//        this.classRepository.delete(s);
//        classes = this.classRepository.getAll();
//        int size = classes.size();
//        assertEquals(1, size);
//    }
//
//    @Test
//    public void p_getAll()
//    {
//        classes = this.classRepository.getAll();
//        assertEquals(1, classes.size());
//
//        System.out.println(classes.size());
//    }
//}