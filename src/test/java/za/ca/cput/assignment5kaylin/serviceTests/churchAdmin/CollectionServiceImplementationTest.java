package za.ca.cput.assignment5kaylin.serviceTests.churchAdmin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Collection;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.CollectionFactory;
import za.ca.cput.assignment5kaylin.service.churchAdmin.implementation.CollectionServiceImplementation;

import java.util.List;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CollectionServiceImplementationTest
{
    @Autowired
    private CollectionServiceImplementation service;
    private List<Collection> classes;
    Collection cl;
    Collection c2;

    @Before
    public void setUp() throws Exception
    {
        //this.classRepository = CollectionRepositoryImplementation.getRepository();
    }

    @Test
    public void l_create()
    {
        //cl = new Collection.Builder().collectId("1").collectAmt(1000.00).build();
        cl = CollectionFactory.getCollection("1", 1000.00);
        c2 = CollectionFactory.getCollection("2", 1400.00);
        Collection c = this.service.create(cl);
        Assert.assertEquals(cl.getCollectId(), c.getCollectId());
        Collection cc = this.service.create(c2);
        Assert.assertEquals(c2.getCollectId(), cc.getCollectId());
    }

    @Test
    public void m_read()
    {
        String s = "1";
        Collection cl = this.service.read(s);

        Assert.assertEquals(s, cl.getCollectId());
        //return classes.iterator().next();
        System.out.println(cl.getCollectId() + " " + cl.getCollectAmt());
    }

    @Test
    public void n_update()
    {
        //cl = new Collection.Builder().collectId("2").collectAmt(1400.00).build();
        cl = CollectionFactory.getCollection("2", 1500.00);
        Collection c = this.service.update(cl);
        Assert.assertEquals(cl.getCollectId(), c.getCollectId());
        System.out.println(c.getCollectId() + "\n"+c.getCollectAmt());
    }

    @Test
    public void o_delete()
    {
        String s = "1";
        this.service.delete(s);
        classes = this.service.getAll();
        int size = classes.size();
        Assert.assertEquals(classes.size(), size);
    }

    @Test
    public void p_getAll()
    {
        classes = this.service.getAll();
        Assert.assertEquals(1, classes.size());

        System.out.println(classes.size());
    }
}
