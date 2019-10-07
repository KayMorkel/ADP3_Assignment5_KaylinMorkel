package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.FrailGoer;
import za.ca.cput.assignment5kaylin.repository.churchPersons.FrailGoerRepository;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.FrailGoerRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.FrailGoerService;

import java.util.List;
import java.util.Set;

@Service
public class FrailGoerServiceImplementation implements FrailGoerService
{
    @Autowired
    private FrailGoerRepository repo;

    private static FrailGoerServiceImplementation service = null;
    //private FrailGoerRepository repo;

    private FrailGoerServiceImplementation()
    {
      //  this.repo = FrailGoerRepositoryImplementation.getRepository();
    }

    public static FrailGoerServiceImplementation getService()
    {
        if(service == null) service = new FrailGoerServiceImplementation();
        return service;
    }

    @Override
    public FrailGoer retrieveById(String id) {
        List<FrailGoer> churches = getAll();
        for(FrailGoer c: churches)
        {
            if (c.getFrailNum().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<FrailGoer> getAll() {
        return this.repo.findAll();
    }

    @Override
    public FrailGoer create(FrailGoer frailGoer) {
        return this.repo.save(frailGoer);
    }

    @Override
    public FrailGoer read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public FrailGoer update(FrailGoer frailGoer) {
        return this.repo.save(frailGoer);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
