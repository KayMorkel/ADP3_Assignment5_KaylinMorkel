package za.ca.cput.assignment5kaylin.service.login.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.login.LoginStatus;
import za.ca.cput.assignment5kaylin.repository.login.LoginStatusRepository;
import za.ca.cput.assignment5kaylin.repository.login.implementations.LoginStatusRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.login.LoginStatusService;

import java.util.Set;

@Service
public class LoginStatusServiceImplementation implements LoginStatusService
{
    @Autowired
    private LoginStatusRepositoryImplementation repo;
    //Here below is Manual Wiring
    /*private static LoginStatusServiceImplementation service = null;
    private LoginStatusRepository repo;

    private LoginStatusServiceImplementation()
    {
        this.repo = LoginStatusRepositoryImplementation.getRepository();
    }

    public static LoginStatusServiceImplementation getService()
    {
        if(service == null) service = new LoginStatusServiceImplementation();
        return service;
    }*/

    @Override
    public LoginStatus create(LoginStatus loginStatus) {
        return this.repo.create(loginStatus);
    }

    @Override
    public LoginStatus read(String s) {
        return this.repo.read(s);
    }

    @Override
    public LoginStatus update(LoginStatus loginStatus) {
        return this.repo.update(loginStatus);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }

    @Override
    public Set<LoginStatus> getAll() {
        return this.repo.getAll();
    }
}
