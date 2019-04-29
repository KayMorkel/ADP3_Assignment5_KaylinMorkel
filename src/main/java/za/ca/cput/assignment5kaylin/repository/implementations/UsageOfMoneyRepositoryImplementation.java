package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.UsageOfMoney;
import za.ca.cput.assignment5kaylin.repository.UsageOfMoneyRepository;

import java.util.HashSet;
import java.util.Set;

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
                System.out.println(cla.getId() + cla.getUsedFor());
                got = new UsageOfMoney.Builder().id(s).usedFor(cla.getUsedFor()).build();
            }
        }

        return got;
    }

    @Override
    public UsageOfMoney update(UsageOfMoney usageOfMoney) {
        if (use.contains(usageOfMoney))
        {
            use.remove(usageOfMoney);
            usageOfMoney = new UsageOfMoney.Builder().id(usageOfMoney.getId()).usedFor(usageOfMoney.getUsedFor()).build();
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
            }
        }
    }
}
