package za.ca.cput.assignment5kaylin.service.login.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.login.Login;
import za.ca.cput.assignment5kaylin.repository.login.LoginRepository;
//import za.ca.cput.assignment5kaylin.repository.login.implementations.LoginRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.login.LoginService;

import java.util.List;
import java.util.Set;

@Service
public class LoginServiceImplementation implements LoginService
{
    @Autowired
    private LoginRepository repo;

    private static LoginServiceImplementation service = null;
    //private LoginRepository repo;

    private LoginServiceImplementation()
    {
      //  this.repo = LoginRepositoryImplementation.getRepository();
    }

    public static LoginServiceImplementation getService()
    {
        if(service == null) service = new LoginServiceImplementation();
        return service;
    }

    @Override
    public Login create(Login login)
    {
        return this.repo.save(login);
    }

    @Override
    public Login read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public Login update(Login login) {
        return this.repo.save(login);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }

    @Override
    public Login retrieveById(String id) {
        List<Login> churches = getAll();
        for(Login c: churches)
        {
            if (c.getUsername().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<Login> getAll() {
        return this.repo.findAll();
    }
}
