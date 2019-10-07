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
//import za.ca.cput.assignment5kaylin.domain.churchAdmin.UsageOfMoney;
//import za.ca.cput.assignment5kaylin.factory.churchAdmin.UsageOfMoneyFactory;
//import za.ca.cput.assignment5kaylin.repository.churchAdmin.UsageOfMoneyRepository;
//import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.UsageOfMoneyRepositoryImplementation;
//
//import java.util.Set;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class UsageOfMoneyRepositoryImplementationTest
//{
//    @Autowired
//    private UsageOfMoneyRepositoryImplementation classRepository;
//    private Set<UsageOfMoney> classes;
//    UsageOfMoney cl;
//    UsageOfMoney c2;
//
//    @Before
//    public void setUp() throws Exception
//    {
//        //this.classRepository = UsageOfMoneyRepositoryImplementation.getRepository();
//    }
//
//    @Test
//    public void l_create()
//    {
//        cl = UsageOfMoneyFactory.getUsage("1", "Electricity");
//        c2 = UsageOfMoneyFactory.getUsage("2", "Repairs");
//        UsageOfMoney c = this.classRepository.create(cl);
//        Assert.assertEquals(cl, c);
//        UsageOfMoney cc = this.classRepository.create(c2);
//        Assert.assertEquals(c2, cc);
//    }
//
//    @Test
//    public void m_read()
//    {
//        String s = "2";
//        UsageOfMoney cl = this.classRepository.read(s);
//
//        Assert.assertEquals(s, cl.getId());
//        //return classes.iterator().next();
//        System.out.println(cl.getId() + " " + cl.getUsedFor());
//    }
//
//    @Test
//    public void n_update()
//    {
//        cl = UsageOfMoneyFactory.getUsage("1", "Electricity");
//        UsageOfMoney c = this.classRepository.update(cl);
//        Assert.assertEquals(cl, c);
//        System.out.println(c.getId() + "\n"+c.getUsedFor());
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