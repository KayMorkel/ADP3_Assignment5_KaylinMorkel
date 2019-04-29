package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.LoginStatus;
import za.ca.cput.assignment5kaylin.repository.LoginStatusRepository;

import java.util.HashSet;
import java.util.Set;

public class LoginStatusRepositoryImplemenation implements LoginStatusRepository
{
    private static LoginStatusRepositoryImplemenation classRepository = null;
    private Set<LoginStatus> logStat;

    private LoginStatusRepositoryImplemenation()
    {
        this.logStat = new HashSet<>();
    }

    public static LoginStatusRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new LoginStatusRepositoryImplemenation();
        return classRepository;

    }

    @Override
    public Set<LoginStatus> getAll() {
        return this.logStat;
    }

    @Override
    public LoginStatus create(LoginStatus loginStatus) {
        this.logStat.add(loginStatus);
        return loginStatus;
    }

    @Override
    public LoginStatus read(String s) {
        LoginStatus got = null;
        for (LoginStatus cla: logStat){
            if (cla.getStatNum().equals(s)) {
                System.out.println(cla.getStatNum() + cla.getStatus());
                got = new LoginStatus.Builder().statNum(s).status(cla.getStatus()).build();
            }
        }

        return got;
    }

    @Override
    public LoginStatus update(LoginStatus loginStatus) {
        if (logStat.contains(loginStatus))
        {
            logStat.remove(loginStatus);
            loginStatus = new LoginStatus.Builder().statNum(loginStatus.getStatNum()).status(loginStatus.getStatus()).build();
            this.logStat.add(loginStatus);
        }
        //}
        return loginStatus;
    }

    @Override
    public void delete(String s) {
        for (LoginStatus cla: logStat)
        {
            if (cla.getStatNum().equals(s))
            {
                this.logStat.remove(cla);
            }
        }
    }
}
