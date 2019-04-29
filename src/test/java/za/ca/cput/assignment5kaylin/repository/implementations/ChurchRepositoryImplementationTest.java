package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.Church;
import za.ca.cput.assignment5kaylin.repository.ChurchRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class ChurchRepositoryImplementationTest {
    private ChurchRepository classRepository;
    private Set<Church> classes;
    Church cl;
    Church c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = ChurchRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new Church.Builder().churchId("Ang12").address("21 Adderley Road, 5698").build();
        c2 = new Church.Builder().churchId("NewAp10").address("22 Norm Road, 5784").build();
        Church c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        Church cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "NewAp10";
        Church cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getChurchId());
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new Church.Builder().churchId("Ang12").address("21 Adderley Road, 5698").build();
        Church c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getChurchId() + "\n"+c.getAddress());
    }

    @Test
    public void delete()
    {
        String s = "Ang12";
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