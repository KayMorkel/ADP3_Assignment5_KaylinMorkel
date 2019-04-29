package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.Class;
import za.ca.cput.assignment5kaylin.repository.ClassRepository;

import java.util.Set;

public class ClassRepositoryImplementationTest
{
    private ClassRepository classRepository;
    private Set<Class> classes;
    Class cl;
    Class c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = ClassRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new Class.Builder().classId("BibC1256").numOfStudents(12).build();
        c2 = new Class.Builder().classId("BibC1246").numOfStudents(10).build();
        Class c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        Class cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "Bib1356";
        Class cl = this.classRepository.read(s);

        Assert.assertEquals(null, cl);
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new Class.Builder().classId("BibC1246").numOfStudents(12).build();
        Class c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getClassId() + "\n"+c.getNumOfStudents());
    }

    @Test
    public void delete()
    {
        String s = "BibC1256";
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