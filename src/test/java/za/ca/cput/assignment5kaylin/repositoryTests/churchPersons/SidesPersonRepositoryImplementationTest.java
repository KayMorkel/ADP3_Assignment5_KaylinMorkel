package za.ca.cput.assignment5kaylin.repositoryTests.churchPersons;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ca.cput.assignment5kaylin.domain.churchPersons.SidesPerson;
import za.ca.cput.assignment5kaylin.factory.churchPersons.SidesPersonFactory;
import za.ca.cput.assignment5kaylin.repository.churchPersons.SidesPersonRepository;
import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.SidesPersonRepositoryImplementation;

import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SidesPersonRepositoryImplementationTest
{
    @Autowired
    private SidesPersonRepository classRepository;
    private Set<SidesPerson> classes;
    SidesPerson cl;
    SidesPerson c2;

    @Before
    public void setUp() throws Exception
    {
        //this.classRepository = SidesPersonRepositoryImplementation.getRepository();
    }

    @Test
    public void l_create()
    {
        cl = SidesPersonFactory.getSideP( "2000","Weekly");
        c2 = SidesPersonFactory.getSideP("3000", "Monthly");
        SidesPerson c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        SidesPerson cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void m_read()
    {
        String s = "3000";
        SidesPerson cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getSal());
        //return classes.iterator().next();
        System.out.println(cl.getSal() + " " + cl.getPayType());
    }

    @Test
    public void n_update()
    {
        cl =  SidesPersonFactory.getSideP("2000", "Annually");
        SidesPerson c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getSal() + "\n"+c.getPayType());
    }

    @Test
    public void o_delete()
    {
        String s = "2000";
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