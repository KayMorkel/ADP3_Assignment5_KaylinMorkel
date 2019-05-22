package za.ca.cput.assignment5kaylin.repositoryTests.churchAdmin;

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
import za.ca.cput.assignment5kaylin.repository.churchAdmin.CollectionRepository;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.CollectionRepositoryImplementation;

import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CollectionRepositoryImplementationTest
{
    @Autowired
    private CollectionRepositoryImplementation classRepository;
    private Set<Collection> classes;
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
        Collection c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        Collection cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void m_read()
    {
        String s = "1";
        Collection cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getCollectId());
        //return classes.iterator().next();
        System.out.println(cl.getCollectId() + " " + cl.getCollectAmt());
    }

    @Test
    public void n_update()
    {
        //cl = new Collection.Builder().collectId("2").collectAmt(1400.00).build();
        cl = CollectionFactory.getCollection("2", 1500.00);
        Collection c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getCollectId() + "\n"+c.getCollectAmt());
    }

    @Test
    public void o_delete()
    {
        String s = "1";
        this.classRepository.delete(s);
        classes = this.classRepository.getAll();
        int size = classes.size();
        Assert.assertEquals(1, size);
    }

    @Test
    public void p_getAll()
    {
        classes = this.classRepository.getAll();
        Assert.assertEquals(1, classes.size());

        System.out.println(classes.size());
    }
}