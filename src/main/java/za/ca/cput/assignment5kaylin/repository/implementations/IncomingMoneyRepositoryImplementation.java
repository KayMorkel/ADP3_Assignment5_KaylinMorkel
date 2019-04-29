package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.IncomingMoney;
import za.ca.cput.assignment5kaylin.repository.IncomingMoneyRepository;

import java.util.HashSet;
import java.util.Set;

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
                System.out.println(cla.getId() + cla.getFrom());
                got = new IncomingMoney.Builder().id(s).from(cla.getFrom()).build();
            }
        }

        return got;
    }

    @Override
    public IncomingMoney update(IncomingMoney incomingMoney) {
        if (income.contains(incomingMoney))
        {
            income.remove(incomingMoney);
            incomingMoney = new IncomingMoney.Builder().id(incomingMoney.getId()).from(incomingMoney.getFrom()).build();
            this.income.add(incomingMoney);
        }
        //}
        return incomingMoney;
    }

    @Override
    public void delete(String s) {
        for (IncomingMoney cla: income)
        {
            if (cla.getId().equals(s))
            {
                this.income.remove(cla);
            }
        }
    }
}
