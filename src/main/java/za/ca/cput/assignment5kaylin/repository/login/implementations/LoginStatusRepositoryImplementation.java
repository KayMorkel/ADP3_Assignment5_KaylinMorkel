package za.ca.cput.assignment5kaylin.repository.login.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.login.LoginStatus;
import za.ca.cput.assignment5kaylin.factory.login.LoginStatusFactory;
import za.ca.cput.assignment5kaylin.repository.login.LoginStatusRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class LoginStatusRepositoryImplementation implements LoginStatusRepository
{
    private static LoginStatusRepositoryImplementation classRepository = null;
    private Set<LoginStatus> logStat;

    private LoginStatusRepositoryImplementation()
    {
        this.logStat = new HashSet<>();
    }

    public static LoginStatusRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new LoginStatusRepositoryImplementation();
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
                got = LoginStatusFactory.getLoginStat(s, cla.getStatus());
            }
        }

        return got;
    }

    @Override
    public LoginStatus update(LoginStatus loginStatus) {
        if (logStat.contains(loginStatus))
        {
            logStat.remove(loginStatus);
            loginStatus = LoginStatusFactory.getLoginStat(loginStatus.getStatNum(), loginStatus.getStatus());
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
                break;
            }
        }
    }
}
