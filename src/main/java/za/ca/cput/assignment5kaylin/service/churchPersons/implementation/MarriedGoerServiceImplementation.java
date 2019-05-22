package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.MarriedGoer;
import za.ca.cput.assignment5kaylin.repository.churchPersons.MarriedGoerRepository;
import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.MarriedGoerRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.MarriedGoerService;

import java.util.Set;

@Service
public class MarriedGoerServiceImplementation implements MarriedGoerService
{
    @Autowired
    private MarriedGoerRepositoryImplementation repo;

    /*private static MarriedGoerServiceImplementation service = null;
    private MarriedGoerRepository repo;

    private MarriedGoerServiceImplementation()
    {
        this.repo = MarriedGoerRepositoryImplementation.getRepository();
    }

    public static MarriedGoerServiceImplementation getService()
    {
        if(service == null) service = new MarriedGoerServiceImplementation();
        return service;
    }*/

    @Override
    public Set<MarriedGoer> getAll() {
        return this.repo.getAll();
    }

    @Override
    public MarriedGoer create(MarriedGoer marriedGoer) {
        return this.repo.create(marriedGoer);
    }

    @Override
    public MarriedGoer read(String s) {
        return this.repo.read(s);
    }

    @Override
    public MarriedGoer update(MarriedGoer marriedGoer) {
        return this.repo.update(marriedGoer);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
