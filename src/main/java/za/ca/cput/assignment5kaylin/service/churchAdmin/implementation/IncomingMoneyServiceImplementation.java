package za.ca.cput.assignment5kaylin.service.churchAdmin.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.IncomingMoney;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.IncomingMoneyRepository;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.IncomingMoneyRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchAdmin.IncomingMoneyService;

import java.util.Set;

@Service
public class IncomingMoneyServiceImplementation implements IncomingMoneyService
{
    @Autowired
    private IncomingMoneyRepositoryImplementation repo;

    /*private static IncomingMoneyServiceImplementation service = null;
    private IncomingMoneyRepository repo;

    private IncomingMoneyServiceImplementation()
    {
        this.repo = IncomingMoneyRepositoryImplementation.getRepository();
    }

    public static IncomingMoneyServiceImplementation getService()
    {
        if(service == null) service = new IncomingMoneyServiceImplementation();
        return service;
    }*/

    @Override
    public Set<IncomingMoney> getAll() {
        return this.repo.getAll();
    }

    @Override
    public IncomingMoney create(IncomingMoney incomingMoney) {
        return this.repo.create(incomingMoney);
    }

    @Override
    public IncomingMoney read(String s) {
        return this.repo.read(s);
    }

    @Override
    public IncomingMoney update(IncomingMoney incomingMoney) {
        return this.repo.update(incomingMoney);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
