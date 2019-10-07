package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.MarriedGoer;
import za.ca.cput.assignment5kaylin.repository.churchPersons.MarriedGoerRepository;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.MarriedGoerRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.MarriedGoerService;

import java.util.List;
import java.util.Set;

@Service
public class MarriedGoerServiceImplementation implements MarriedGoerService
{
    @Autowired
    private MarriedGoerRepository repo;

    private static MarriedGoerServiceImplementation service = null;
    //private MarriedGoerRepository repo;

    private MarriedGoerServiceImplementation()
    {
      //  this.repo = MarriedGoerRepositoryImplementation.getRepository();
    }

    public static MarriedGoerServiceImplementation getService()
    {
        if(service == null) service = new MarriedGoerServiceImplementation();
        return service;
    }

    @Override
    public MarriedGoer retrieveById(String id) {
        List<MarriedGoer> churches = getAll();
        for(MarriedGoer c: churches)
        {
            if (c.getId().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<MarriedGoer> getAll() {
        return this.repo.findAll();
    }

    @Override
    public MarriedGoer create(MarriedGoer marriedGoer) {
        return this.repo.save(marriedGoer);
    }

    @Override
    public MarriedGoer read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public MarriedGoer update(MarriedGoer marriedGoer) {
        return this.repo.save(marriedGoer);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
