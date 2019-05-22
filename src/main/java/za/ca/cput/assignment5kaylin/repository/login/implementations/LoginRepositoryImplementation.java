package za.ca.cput.assignment5kaylin.repository.login.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.login.Login;
import za.ca.cput.assignment5kaylin.factory.login.LoginFactory;
import za.ca.cput.assignment5kaylin.repository.login.LoginRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class LoginRepositoryImplementation implements LoginRepository
{
    private static LoginRepositoryImplementation classRepository = null;
    private Set<Login> logRep;

    private LoginRepositoryImplementation()
    {
        this.logRep = new HashSet<>();
    }

    public static LoginRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new LoginRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Set<Login> getAll() {
        return this.logRep;
    }

    @Override
    public Login create(Login login) {
        this.logRep.add(login);
        return login;
    }

    @Override
    public Login read(String s) {
        Login got = null;
        for (Login cla: logRep){
            if (cla.getUsername().equals(logRep)) {
                System.out.println(cla.getUsername() + cla.getPassword());
                got = LoginFactory.getLogin(s, cla.getPassword());
            }
        }

        return got;
    }

    @Override
    public Login update(Login login) {
        if (logRep.contains(login))
        {
            logRep.remove(login);
            login = LoginFactory.getLogin(login.getUsername(), login.getPassword());
            this.logRep.add(login);
        }
        //}
        return login;
    }

    @Override
    public void delete(String s) {
        for (Login cla: logRep)
        {
            if (cla.getUsername().equals(s))
            {
                this.logRep.remove(cla);
                break;
            }
        }
    }
}
