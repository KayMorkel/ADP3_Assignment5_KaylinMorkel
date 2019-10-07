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
//import za.ca.cput.assignment5kaylin.domain.churchPersons.BoatBoy;
//import za.ca.cput.assignment5kaylin.factory.churchPersons.BoatBoyFactory;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.BoatBoyRepository;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.BoatBoyRepositoryImplementation;
//
//import java.util.Set;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class BoatBoyRepositoryImplementationTest
//{
//    @Autowired
//    private BoatBoyRepositoryImplementation classRepository;
//    private Set<BoatBoy> classes;
//    BoatBoy cl;
//    BoatBoy c2;
//
//    @Before
//    public void setUp() throws Exception {
//        //this.classRepository = BoatBoyRepositoryImplementation.getRepository();
//    }
//
//    @Test
//    public void l_create() {
//        cl = BoatBoyFactory.getBB("2000", "Weekly");
//        c2 = BoatBoyFactory.getBB("3000", "Monthly");
//        BoatBoy c = this.classRepository.create(cl);
//        Assert.assertEquals(cl, c);
//        BoatBoy cc = this.classRepository.create(c2);
//        Assert.assertEquals(c2, cc);
//    }
//
//    @Test
//    public void m_read() {
//        String s = "2000";
//        BoatBoy cl = this.classRepository.read(s);
//
//        Assert.assertEquals(s, cl.getSal());
//        //return classes.iterator().next();
//        System.out.println(cl.getSal() + " " + cl.getPayType());
//    }
//
//    @Test
//    public void n_update() {
//        cl = BoatBoyFactory.getBB("2000", "Annually");
//        BoatBoy c = this.classRepository.update(cl);
//        Assert.assertEquals(cl, c);
//        System.out.println(c.getSal() + "\n"+c.getPayType());
//    }
//
//    @Test
//    public void o_delete() {
//        String s = "2000";
//        this.classRepository.delete(s);
//        classes = this.classRepository.getAll();
//        int size = classes.size();
//        Assert.assertEquals(1, size);
//    }
//
//    @Test
//    public void p_getAll() {
//        classes = this.classRepository.getAll();
//        Assert.assertEquals(1, classes.size());
//
//        System.out.println(classes.size());
//    }
//}