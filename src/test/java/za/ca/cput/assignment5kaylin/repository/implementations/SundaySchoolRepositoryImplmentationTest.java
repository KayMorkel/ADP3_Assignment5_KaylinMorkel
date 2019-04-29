package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.SundaySchool;
import za.ca.cput.assignment5kaylin.repository.SundaySchoolRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class SundaySchoolRepositoryImplmentationTest {
    private SundaySchoolRepository classRepository;
    private Set<SundaySchool> classes;
    SundaySchool cl;
    SundaySchool c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = SundaySchoolRepositoryImplmentation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new SundaySchool.Builder().classNo("1").build();
        c2 = new SundaySchool.Builder().classNo("2").build();
        SundaySchool c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        SundaySchool cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "2";
        SundaySchool cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getClassNo());
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new SundaySchool.Builder().classNo("1").build();
        SundaySchool c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getClassNo());
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