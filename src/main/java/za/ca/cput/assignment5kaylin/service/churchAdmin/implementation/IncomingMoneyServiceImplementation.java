package za.ca.cput.assignment5kaylin.service.churchAdmin.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.IncomingMoney;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.IncomingMoneyRepository;
//import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.IncomingMoneyRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchAdmin.IncomingMoneyService;

import java.util.List;
import java.util.Set;

@Service
public class IncomingMoneyServiceImplementation implements IncomingMoneyService
{
    @Autowired
    private IncomingMoneyRepository repo;

    private static IncomingMoneyServiceImplementation service = null;
    //private IncomingMoneyRepository repo;

    private IncomingMoneyServiceImplementation()
    {
      //  this.repo = IncomingMoneyRepositoryImplementation.getRepository();
    }

    public static IncomingMoneyServiceImplementation getService()
    {
        if(service == null) service = new IncomingMoneyServiceImplementation();
        return service;
    }

    @Override
    public IncomingMoney retrieveById(String id) {
        List<IncomingMoney> churches = getAll();
        for(IncomingMoney c: churches)
        {
            if (c.getId().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<IncomingMoney> getAll() {
        return this.repo.findAll();
    }

    @Override
    public IncomingMoney create(IncomingMoney incomingMoney) {
        return this.repo.save(incomingMoney);
    }

    @Override
    public IncomingMoney read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public IncomingMoney update(IncomingMoney incomingMoney) {
        return this.repo.save(incomingMoney);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
