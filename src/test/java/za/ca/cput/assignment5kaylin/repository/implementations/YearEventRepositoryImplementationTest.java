package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.YearEvent;
import za.ca.cput.assignment5kaylin.repository.YearEventRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class YearEventRepositoryImplementationTest {
    private YearEventRepository classRepository;
    private Set<YearEvent> classes;
    YearEvent cl;
    YearEvent c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = YearEventRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new YearEvent.Builder().eventNum("1").name("Family Day").build();
        c2 = new YearEvent.Builder().eventNum("2").name("Family Day").build();
        YearEvent c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        YearEvent cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "2";
        YearEvent cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getEventNum());
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new YearEvent.Builder().eventNum("1").name("Family Day").build();
        YearEvent c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getEventNum() + "\n"+c.getName());
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