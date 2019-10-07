package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.DeceasedGoer;
import za.ca.cput.assignment5kaylin.repository.churchPersons.DeceasedGoerRepository;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.DeceasedGoerRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.DeceasedGoerService;

import java.util.List;
import java.util.Set;

@Service
public class DeceasedGoerServiceImplementation implements DeceasedGoerService
{
    @Autowired
    private DeceasedGoerRepository repo;

    private static DeceasedGoerServiceImplementation service = null;
    //private DeceasedGoerRepository repo;

    private DeceasedGoerServiceImplementation()
    {
      //  this.repo = DeceasedGoerRepositoryImplementation.getRepository();
    }

    public static DeceasedGoerServiceImplementation getService()
    {
        if(service == null) service = new DeceasedGoerServiceImplementation();
        return service;
    }

    @Override
    public DeceasedGoer retrieveById(String id) {
        List<DeceasedGoer> churches = getAll();
        for(DeceasedGoer c: churches)
        {
            if (c.getDecNum().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<DeceasedGoer> getAll() {
        return this.repo.findAll();
    }

    @Override
    public DeceasedGoer create(DeceasedGoer deceasedGoer) {
        return this.repo.save(deceasedGoer);
    }

    @Override
    public DeceasedGoer read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public DeceasedGoer update(DeceasedGoer deceasedGoer) {
        return this.repo.save(deceasedGoer);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
