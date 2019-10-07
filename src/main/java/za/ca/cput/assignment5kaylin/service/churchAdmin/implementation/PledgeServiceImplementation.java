package za.ca.cput.assignment5kaylin.service.churchAdmin.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Pledge;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.PledgeRepository;
//import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.PledgeRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchAdmin.PledgeService;

import java.util.List;
import java.util.Set;

@Service
public class PledgeServiceImplementation implements PledgeService
{
    @Autowired
    private PledgeRepository repo;

    private static PledgeServiceImplementation service = null;
    //private PledgeRepository repo;

    private PledgeServiceImplementation()
    {
    //    this.repo = PledgeRepositoryImplementation.getRepository();
    }

    public static PledgeServiceImplementation getService()
    {
        if(service == null) service = new PledgeServiceImplementation();
        return service;
    }

    @Override
    public Pledge retrieveById(String id) {
        List<Pledge> churches = getAll();
        for(Pledge c: churches)
        {
            if (c.getPledgeNum().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<Pledge> getAll() {
        return this.repo.findAll();
    }

    @Override
    public Pledge create(Pledge pledge) {
        return this.repo.save(pledge);
    }

    @Override
    public Pledge read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public Pledge update(Pledge pledge) {
        return this.repo.save(pledge);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
