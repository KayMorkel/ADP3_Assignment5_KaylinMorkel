//package za.ca.cput.assignment5kaylin.repositoryTests.churchPersons;
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
//import za.ca.cput.assignment5kaylin.repository.churchPersons.StandardGoerRepository;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.StandardGoerRepositoryImplementation;
//
//import java.util.Set;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class StandardGoerRepositoryImplementationTest
//{
//    @Autowired
//    private StandardGoerRepository classRepository;
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
//        StandardGoer c = this.classRepository.create(cl);
//        Assert.assertEquals(cl, c);
//        StandardGoer cc = this.classRepository.create(c2);
//        Assert.assertEquals(c2, cc);
//    }
//
//    @Test
//    public void m_read()
//    {
//        String s = "no";
//        StandardGoer cl = this.classRepository.read(s);
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
//        StandardGoer c = this.classRepository.update(cl);
//        Assert.assertEquals(cl, c);
//        System.out.println(c.getPledger());
//    }
//
//    @Test
//    public void o_delete()
//    {
//        String s = "yes";
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