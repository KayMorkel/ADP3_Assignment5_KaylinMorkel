package za.ca.cput.assignment5kaylin.repository.implementations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.Login;
import za.ca.cput.assignment5kaylin.repository.LoginRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class LoginRepositoryImplementationTest {
    private LoginRepository classRepository;
    private Set<Login> classes;
    Login cl;
    Login c2;

    @Before
    public void setUp() throws Exception
    {
        this.classRepository = LoginRepositoryImplementation.getRepository();
    }

    @Test
    public void create()
    {
        cl = new Login.Builder().username("kelMer12").password("joenma").build();
        c2 = new Login.Builder().username("ldojj").password("djkkhbk").build();
        Login c = this.classRepository.create(cl);
        Assert.assertEquals(cl, c);
        Login cc = this.classRepository.create(c2);
        Assert.assertEquals(c2, cc);
    }

    @Test
    public void read()
    {
        String s = "kelMer12";
        Login cl = this.classRepository.read(s);

        Assert.assertEquals(null, cl);
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void update()
    {
        cl = new Login.Builder().username("kelMer12").password("joenma").build();
        Login c = this.classRepository.update(cl);
        Assert.assertEquals(cl, c);
        System.out.println(c.getUsername() + "\n"+c.getPassword());
    }

    @Test
    public void delete()
    {
        String s = "kelMer12";
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