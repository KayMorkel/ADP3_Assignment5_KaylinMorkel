package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.Priest;
import za.ca.cput.assignment5kaylin.repository.PriestRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class PriestRepositoryImplementationTest {
    private PriestRepository classRepository;
    private Set<Priest> classes;
    Priest cl;
    Priest c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = PriestRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new Priest.Builder().inductDate("1996/08/09").sal("2000").build();
        c2 = new Priest.Builder().inductDate("2000/08/09").sal("2000").build();
        Priest c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        Priest cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "1996/08/09";
        Priest cl = this.classRepository.read(s);

        Assert.assertEquals(null, cl);
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new Priest.Builder().inductDate("1996/08/09").sal("2000").build();
        Priest c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getInductDate() + "\n"+c.getSal());
    }

    @Test
    public void delete()
    {
        String s = "1996/08/09";
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