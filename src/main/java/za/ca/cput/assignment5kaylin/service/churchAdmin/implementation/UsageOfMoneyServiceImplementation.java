package za.ca.cput.assignment5kaylin.service.churchAdmin.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.UsageOfMoney;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.UsageOfMoneyRepository;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.UsageOfMoneyRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchAdmin.UsageOfMoneyService;

import java.util.Set;

@Service
public class UsageOfMoneyServiceImplementation implements UsageOfMoneyService
{
    @Autowired
    private UsageOfMoneyRepositoryImplementation repo;

    /*private static UsageOfMoneyServiceImplementation service = null;
    private UsageOfMoneyRepository repo;

    private UsageOfMoneyServiceImplementation()
    {
        this.repo = UsageOfMoneyRepositoryImplementation.getRepository();
    }

    public static UsageOfMoneyServiceImplementation getService()
    {
        if(service == null) service = new UsageOfMoneyServiceImplementation();
        return service;
    }*/

    @Override
    public Set<UsageOfMoney> getAll() {
        return this.repo.getAll();
    }

    @Override
    public UsageOfMoney create(UsageOfMoney usageOfMoney) {
        return this.repo.create(usageOfMoney);
    }

    @Override
    public UsageOfMoney read(String s) {
        return this.repo.read(s);
    }

    @Override
    public UsageOfMoney update(UsageOfMoney usageOfMoney) {
        return this.repo.update(usageOfMoney);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
