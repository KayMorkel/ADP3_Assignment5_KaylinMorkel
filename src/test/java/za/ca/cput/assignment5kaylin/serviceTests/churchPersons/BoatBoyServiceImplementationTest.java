package za.ca.cput.assignment5kaylin.serviceTests.churchPersons;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ca.cput.assignment5kaylin.domain.churchPersons.BoatBoy;
import za.ca.cput.assignment5kaylin.factory.churchPersons.BoatBoyFactory;
import za.ca.cput.assignment5kaylin.service.churchPersons.implementation.BoatBoyServiceImplementation;

import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BoatBoyServiceImplementationTest
{
    @Autowired
    private BoatBoyServiceImplementation service;
    private Set<BoatBoy> classes;
    BoatBoy cl;
    BoatBoy c2;

    @Before
    public void setUp() throws Exception {
        //this.classRepository = BoatBoyRepositoryImplementation.getRepository();
    }

    @Test
    public void l_create() {
        cl = BoatBoyFactory.getBB("2000", "Weekly");
        c2 = BoatBoyFactory.getBB("3000", "Monthly");
        BoatBoy c = this.service.create(cl);
        Assert.assertEquals(cl, c);
        BoatBoy cc = this.service.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void m_read() {
        String s = "2000";
        BoatBoy cl = this.service.read(s);

        Assert.assertEquals(s, cl.getSal());
        //return classes.iterator().next();
        System.out.println(cl.getSal() + " " + cl.getPayType());
    }

    @Test
    public void n_update() {
        cl = BoatBoyFactory.getBB("2000", "Annually");
        BoatBoy c = this.service.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getSal() + "\n"+c.getPayType());
    }

    @Test
    public void o_delete() {
        String s = "2000";
        this.service.delete(s);
        classes = this.service.getAll();
        int size = classes.size();
        Assert.assertEquals(classes.size(), size);
    }

    @Test
    public void p_getAll() {
        classes = this.service.getAll();
        Assert.assertEquals(2, classes.size());

        System.out.println(classes.size());
    }
}
