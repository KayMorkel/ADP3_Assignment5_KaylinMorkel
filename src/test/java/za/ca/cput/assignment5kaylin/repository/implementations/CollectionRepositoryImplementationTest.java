package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.Collection;
import za.ca.cput.assignment5kaylin.repository.CollectionRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class CollectionRepositoryImplementationTest {
    private CollectionRepository classRepository;
    private Set<Collection> classes;
    Collection cl;
    Collection c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = CollectionRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new Collection.Builder().collectId("1").collectAmt(1000.00).build();
        c2 = new Collection.Builder().collectId("2").collectAmt(1400.00).build();
        Collection c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        Collection cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "1";
        Collection cl = this.classRepository.read(s);

        Assert.assertEquals(null, cl);
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new Collection.Builder().collectId("2").collectAmt(1400.00).build();
        Collection c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getCollectId() + "\n"+c.getCollectAmt());
    }

    @Test
    public void delete()
    {
        String s = "1";
        this.classRepository.delete(s);
        classes = this.classRepository.getAll();
        int size = classes.size();
        Assert.assertEquals(1, size);
    }

    @Test
    public void getAll()
    {
        classes = this.classRepository.getAll();
        Assert.assertEquals(1, classes.size());

        System.out.println(classes.size());
    }
}