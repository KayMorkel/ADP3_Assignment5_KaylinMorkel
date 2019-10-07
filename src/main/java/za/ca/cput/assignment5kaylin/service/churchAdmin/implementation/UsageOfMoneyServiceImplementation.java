package za.ca.cput.assignment5kaylin.service.churchAdmin.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.UsageOfMoney;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.UsageOfMoneyRepository;
//import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.UsageOfMoneyRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchAdmin.UsageOfMoneyService;

import java.util.List;
import java.util.Set;

@Service
public class UsageOfMoneyServiceImplementation implements UsageOfMoneyService
{
    @Autowired
    private UsageOfMoneyRepository repo;

    private static UsageOfMoneyServiceImplementation service = null;
    //private UsageOfMoneyRepository repo;

    private UsageOfMoneyServiceImplementation()
    {
      //  this.repo = UsageOfMoneyRepositoryImplementation.getRepository();
    }

    public static UsageOfMoneyServiceImplementation getService()
    {
        if(service == null) service = new UsageOfMoneyServiceImplementation();
        return service;
    }

    @Override
    public UsageOfMoney retrieveById(String id) {
        List<UsageOfMoney> churches = getAll();
        for(UsageOfMoney c: churches)
        {
            if (c.getId().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<UsageOfMoney> getAll() {
        return this.repo.findAll();
    }

    @Override
    public UsageOfMoney create(UsageOfMoney usageOfMoney) {
        return this.repo.save(usageOfMoney);
    }

    @Override
    public UsageOfMoney read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public UsageOfMoney update(UsageOfMoney usageOfMoney) {
        return this.repo.save(usageOfMoney);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
