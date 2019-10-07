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
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Church;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.ChurchFactory;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.ChurchRepository;
//import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.ChurchRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchAdmin.implementation.ChurchServiceImplementation;

import java.util.List;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ChurchServiceImplementationTest
{
    @Autowired
    private ChurchServiceImplementation service;
    private List<Church> classes;
    Church cl;
    Church c2;

    @Before
    public void setUp() throws Exception
    {
        //this.service = ChurchRepositoryImplementation.getRepository();

        //c2 = ChurchFactory.getChurch("NewAp10", "22 Norm Road, 5784");
    }

    @Test
    public void l_create()
    {
        cl = ChurchFactory.getChurch("Ang12", "21 Adderley Road, 5698");
        Church c = this.service.create(cl);
        Assert.assertEquals(cl, c);
        //Church cc = this.service.create(c2);
        //Assert.assertEquals(c2, cc);
    }

    @Test
    public void m_read()
    {
        String s = "Ang12";
        Church cl = this.service.read(s);

        Assert.assertEquals(s, cl.getChurchId());
        System.out.println(cl.getChurchId() + " " + cl.getAddress());
    }

    @Test
    public void n_update()
    {
        cl = ChurchFactory.getChurch("Ang12", "21 Adderley Road, 5798");
        Church c = this.service.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getChurchId() + "\n"+c.getAddress());
    }

    @Test
    public void o_delete()
    {
        String s = "Ang12";
        this.service.delete(s);
        classes = this.service.getAll();
        int size = classes.size();
        System.out.println(size);
        Assert.assertEquals(classes.size(), size);
    }

    @Test
    public void p_getAll()
    {
        classes = this.service.getAll();
        System.out.println(classes.size());
        Assert.assertEquals(1, classes.size());


    }
}
