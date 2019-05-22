package za.ca.cput.assignment5kaylin.service.churchAdmin.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Pledge;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.PledgeRepository;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.PledgeRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchAdmin.PledgeService;

import java.util.Set;

@Service
public class PledgeServiceImplementation implements PledgeService
{
    @Autowired
    private PledgeRepositoryImplementation repo;

    /*private static PledgeServiceImplementation service = null;
    private PledgeRepository repo;

    private PledgeServiceImplementation()
    {
        this.repo = PledgeRepositoryImplementation.getRepository();
    }

    public static PledgeServiceImplementation getService()
    {
        if(service == null) service = new PledgeServiceImplementation();
        return service;
    }*/

    @Override
    public Set<Pledge> getAll() {
        return this.repo.getAll();
    }

    @Override
    public Pledge create(Pledge pledge) {
        return this.repo.create(pledge);
    }

    @Override
    public Pledge read(String s) {
        return this.repo.read(s);
    }

    @Override
    public Pledge update(Pledge pledge) {
        return this.repo.update(pledge);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
