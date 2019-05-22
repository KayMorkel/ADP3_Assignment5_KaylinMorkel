package za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.IncomingMoney;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.IncomingMoneyFactory;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.IncomingMoneyRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class IncomingMoneyRepositoryImplementation implements IncomingMoneyRepository
{
    private static IncomingMoneyRepositoryImplementation classRepository = null;
    private Set<IncomingMoney> income;

    private IncomingMoneyRepositoryImplementation()
    {
        this.income = new HashSet<>();
    }

    public static IncomingMoneyRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new IncomingMoneyRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Set<IncomingMoney> getAll() {
        return this.income;
    }

    @Override
    public IncomingMoney create(IncomingMoney incomingMoney) {
        this.income.add(incomingMoney);
        return incomingMoney;
    }

    @Override
    public IncomingMoney read(String s) {
        IncomingMoney got = null;
        for (IncomingMoney cla: income){
            if (cla.getId().equals(s)) {
                System.out.println(cla.getId() +" "+ cla.getFrom());
                got = IncomingMoneyFactory.getIncMon(s, cla.getFrom());
            }
        }

        return got;
    }

    @Override
    public IncomingMoney update(IncomingMoney incomingMoney) {
        if (income.contains(incomingMoney))
        {
            income.remove(incomingMoney);
            incomingMoney = IncomingMoneyFactory.getIncMon(incomingMoney.getId(), incomingMoney.getFrom());
            this.income.add(incomingMoney);
        }
        return incomingMoney;
    }

    @Override
    public void delete(String s) {
        for (IncomingMoney cla: income)
        {
            if (cla.getId().equals(s))
            {
                this.income.remove(cla);
                break;
            }
        }
    }
}
