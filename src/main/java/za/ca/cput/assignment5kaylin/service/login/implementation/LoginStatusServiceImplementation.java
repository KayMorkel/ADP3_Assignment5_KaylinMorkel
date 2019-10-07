package za.ca.cput.assignment5kaylin.service.login.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.login.LoginStatus;
import za.ca.cput.assignment5kaylin.repository.login.LoginStatusRepository;
//import za.ca.cput.assignment5kaylin.repository.login.implementations.LoginStatusRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.login.LoginStatusService;

import java.util.List;
import java.util.Set;

@Service
public class LoginStatusServiceImplementation implements LoginStatusService
{
    @Autowired
    private LoginStatusRepository repo;
    //Here below is Manual Wiring
    private static LoginStatusServiceImplementation service = null;
    //private LoginStatusRepository repo;

    private LoginStatusServiceImplementation()
    {
        //this.repo = LoginStatusRepositoryImplementation.getRepository();
    }

    public static LoginStatusServiceImplementation getService()
    {
        if(service == null) service = new LoginStatusServiceImplementation();
        return service;
    }

    @Override
    public LoginStatus create(LoginStatus loginStatus) {
        return this.repo.save(loginStatus);
    }

    @Override
    public LoginStatus read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public LoginStatus update(LoginStatus loginStatus) {
        return this.repo.save(loginStatus);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }

    @Override
    public LoginStatus retrieveById(String id) {
        List<LoginStatus> churches = getAll();
        for(LoginStatus c: churches)
        {
            if (c.getStatNum().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<LoginStatus> getAll() {
        return this.repo.findAll();
    }
}
