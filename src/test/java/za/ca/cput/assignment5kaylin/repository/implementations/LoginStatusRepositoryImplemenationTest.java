package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.LoginStatus;
import za.ca.cput.assignment5kaylin.repository.LoginStatusRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class LoginStatusRepositoryImplemenationTest {
    private LoginStatusRepository classRepository;
    private Set<LoginStatus> classes;
    LoginStatus cl;
    LoginStatus c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = LoginStatusRepositoryImplemenation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new LoginStatus.Builder().statNum("1").status("Offline").build();
        c2 = new LoginStatus.Builder().statNum("2").status("Online").build();
        LoginStatus c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        LoginStatus cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "2";
        LoginStatus cl = this.classRepository.read(s);

        Assert.assertEquals(s, cl.getStatNum());
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new LoginStatus.Builder().statNum("1").status("Offline").build();
        LoginStatus c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getStatNum() + "\n"+c.getStatus());
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