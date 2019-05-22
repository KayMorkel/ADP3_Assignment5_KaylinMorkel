package za.ca.cput.assignment5kaylin.repositoryTests.login;


import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ca.cput.assignment5kaylin.domain.login.Login;
import za.ca.cput.assignment5kaylin.factory.login.LoginFactory;
import za.ca.cput.assignment5kaylin.repository.login.implementations.LoginRepositoryImplementation;

import java.io.IOException;
import java.util.Set;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginRepositoryImplementationTest
{
    @Autowired
    private LoginRepositoryImplementation classRepository;
    private Set<Login> classes;
    Login cl;
    Login c2;

    @Before
    public void setUp() throws Exception
    {
        //this.classRepository = LoginRepositoryImplementation.getRepository();
    }

    @Test
    public void l_create()
    {
        cl = LoginFactory.getLogin("kelMer12", "joenma");
        c2 = LoginFactory.getLogin("ldojj", "djkkhbk");
        Login c = this.classRepository.create(cl);
        assertEquals(cl, c);
        Login cc = this.classRepository.create(c2);
        assertEquals(c2, cc);
    }

    @Test
    public void m_read()
    {
        String s = "kelMer12";
        Login cl = this.classRepository.read(s);

        assertEquals(null, cl);
        //return classes.iterator().next();
        System.out.println(cl);
    }

    @Test
    public void n_update()
    {
        cl = LoginFactory.getLogin("kelMer12", "joenma");
        Login c = this.classRepository.update(cl);
        assertEquals(cl, c);
        System.out.println(c.getUsername() + "\n"+c.getPassword());
    }

    @Test
    public void o_delete()
    {
        String s = "kelMer12";
        this.classRepository.delete(s);
        classes = this.classRepository.getAll();
        int size = classes.size();
        assertEquals(1, size);
    }

    @Test
    public void p_getAll()
    {
        classes = this.classRepository.getAll();
        assertEquals(1, classes.size());

        System.out.println(classes.size());
    }
}