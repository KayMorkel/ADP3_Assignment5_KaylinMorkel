package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.Login;
import za.ca.cput.assignment5kaylin.repository.LoginRepository;

import java.util.HashSet;
import java.util.Set;

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
                got = new Login.Builder().username(s).password(cla.getPassword()).build();
            }
        }

        return got;
    }

    @Override
    public Login update(Login login) {
        if (logRep.contains(login))
        {
            logRep.remove(login);
            login = new Login.Builder().username(login.getUsername()).password(login.getPassword()).build();
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
            }
        }
    }
}
