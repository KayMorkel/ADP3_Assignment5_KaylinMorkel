package za.ca.cput.assignment5kaylin.service.churchClasses.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchClasses.BaptismClass;
import za.ca.cput.assignment5kaylin.repository.churchClasses.BaptismClassRepository;
import za.ca.cput.assignment5kaylin.repository.churchClasses.implementations.BaptismClassRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchClasses.BaptismClassService;

import java.util.Set;

@Service
public class BaptismClassServiceImplementation implements BaptismClassService
{
    @Autowired
    private BaptismClassRepositoryImplementation repo;

    /*private static BaptismClassServiceImplementation service = null;
    private BaptismClassRepository repo;

    private BaptismClassServiceImplementation()
    {
        this.repo = BaptismClassRepositoryImplementation.getRepository();
    }

    public static BaptismClassServiceImplementation getService()
    {
        if(service == null) service = new BaptismClassServiceImplementation();
        return service;
    }*/

    @Override
    public Set<BaptismClass> getAll() {
        return this.repo.getAll();
    }

    @Override
    public BaptismClass create(BaptismClass baptismClass) {
        return this.repo.create(baptismClass);
    }

    @Override
    public BaptismClass read(String s) {
        return this.repo.read(s);
    }

    @Override
    public BaptismClass update(BaptismClass baptismClass) {
        return this.repo.update(baptismClass);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
