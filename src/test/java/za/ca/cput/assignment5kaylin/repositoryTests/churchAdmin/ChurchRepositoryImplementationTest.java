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
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Church;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.ChurchFactory;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.ChurchRepository;
//import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.ChurchRepositoryImplementation;

import java.util.List;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ChurchRepositoryImplementationTest
{
    @Autowired
    private ChurchRepository classRepository;
    private List<Church> classes;
    Church cl;
    Church c2;

    @Before
    public void setUp() throws Exception
    {
        //this.classRepository = ChurchRepositoryImplementation.getRepository();
    }

    @Test
    public void l_create()
    {
        cl = ChurchFactory.getChurch("Ang12", "21 Adderley Road, 5698");
//        cl = new Church.Builder().churchId("Ang12").address("21 Adderley Road, 5698").build();
        c2 = ChurchFactory.getChurch("NewAp10", "22 Norm Road, 5784");
        Church c = this.classRepository.save(cl);
        Assert.assertEquals(cl, c);
        Church cc = this.classRepository.save(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void m_read()
    {
        String s = "Ang12";
        Church cl = this.classRepository.findById(s).orElse(null);

        Assert.assertEquals(s, cl.getChurchId());
        //return classes.iterator().next();
        System.out.println(cl.getChurchId() + " " + cl.getAddress());
    }

    @Test
    public void n_update()
    {
        cl = ChurchFactory.getChurch("Ang12", "21 Adderley Road, 5798");
//        cl = new Church.Builder().churchId("Ang12").address("21 Adderley Road, 5698").build();
        Church c = this.classRepository.save(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getChurchId() + "\n"+c.getAddress());
    }

    @Test
    public void o_delete()
    {
        String s = "Ang12";
        this.classRepository.deleteById(s);
        classes = this.classRepository.findAll();
        int size = classes.size();
        Assert.assertEquals(1, size);
    }

    @Test
    public void p_getAll()
    {
        classes = this.classRepository.findAll();
        Assert.assertEquals(1, classes.size());

        System.out.println(classes.size());
    }
}