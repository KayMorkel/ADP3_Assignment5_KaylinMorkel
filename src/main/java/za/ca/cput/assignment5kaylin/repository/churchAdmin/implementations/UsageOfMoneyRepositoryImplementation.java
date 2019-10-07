/*package za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.UsageOfMoney;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.UsageOfMoneyFactory;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.UsageOfMoneyRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class UsageOfMoneyRepositoryImplementation implements UsageOfMoneyRepository
{
    private static UsageOfMoneyRepositoryImplementation classRepository = null;
    private Set<UsageOfMoney> use;

    private UsageOfMoneyRepositoryImplementation()
    {
        this.use = new HashSet<>();
    }

    public static UsageOfMoneyRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new UsageOfMoneyRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Set<UsageOfMoney> getAll() {
        return this.use;
    }

    @Override
    public UsageOfMoney create(UsageOfMoney usageOfMoney) {
        this.use.add(usageOfMoney);
        return usageOfMoney;
    }

    @Override
    public UsageOfMoney read(String s) {
        UsageOfMoney got = null;
        for (UsageOfMoney cla: use){
            if (cla.getId().equals(s)) {
                System.out.println(cla.getId() + " " + cla.getUsedFor());
                got = UsageOfMoneyFactory.getUsage(s, cla.getUsedFor());
            }
        }

        return got;
    }

    @Override
    public UsageOfMoney update(UsageOfMoney usageOfMoney) {
        if (use.contains(usageOfMoney))
        {
            use.remove(usageOfMoney);
            usageOfMoney = UsageOfMoneyFactory.getUsage(usageOfMoney.getId(), usageOfMoney.getUsedFor());
            this.use.add(usageOfMoney);
        }
        //}
        return usageOfMoney;
    }

    @Override
    public void delete(String s) {
        for (UsageOfMoney cla: use)
        {
            if (cla.getId().equals(s))
            {
                this.use.remove(cla);
                break;
            }
        }
    }
}*/
