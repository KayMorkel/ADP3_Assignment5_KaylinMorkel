//package za.ca.cput.assignment5kaylin.repositoryTests.churchAdmin;
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
//import za.ca.cput.assignment5kaylin.repository.churchAdmin.IncomingMoneyRepository;
//import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.IncomingMoneyRepositoryImplementation;
//
//import java.util.Set;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class IncomingMoneyRepositoryImplementationTest
//{
//    @Autowired
//    private IncomingMoneyRepositoryImplementation classRepository;
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
//        IncomingMoney c = this.classRepository.create(cl);
//        Assert.assertEquals(cl, c);
//        IncomingMoney cc = this.classRepository.create(c2);
//        Assert.assertEquals(c2, cc);
//    }
//
//    @Test
//    public void m_read()
//    {
//        String s = "1";
//        IncomingMoney cl = this.classRepository.read(s);
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
//        IncomingMoney c = this.classRepository.update(cl);
//        Assert.assertEquals(cl, c);
//        System.out.println(c.getId() + "\n"+c.getFrom());
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