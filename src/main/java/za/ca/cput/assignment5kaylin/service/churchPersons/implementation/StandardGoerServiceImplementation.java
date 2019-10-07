package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.StandardGoer;
import za.ca.cput.assignment5kaylin.repository.churchPersons.StandardGoerRepository;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.StandardGoerRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.StandardGoerService;

import java.util.List;
import java.util.Set;

@Service
public class StandardGoerServiceImplementation implements StandardGoerService
{
    @Autowired
    private StandardGoerRepository repo;

    private static StandardGoerServiceImplementation service = null;
    //private StandardGoerRepository repo;

    private StandardGoerServiceImplementation()
    {
      //  this.repo = StandardGoerRepositoryImplementation.getRepository();
    }

    public static StandardGoerServiceImplementation getService()
    {
        if(service == null) service = new StandardGoerServiceImplementation();
        return service;
    }

    @Override
    public StandardGoer retrieveById(String id) {
        List<StandardGoer> churches = getAll();
        for(StandardGoer c: churches)
        {
            if (c.getPledger().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<StandardGoer> getAll() {
        return this.repo.findAll();
    }

    @Override
    public StandardGoer create(StandardGoer standardGoer) {
        return this.repo.save(standardGoer);
    }

    @Override
    public StandardGoer read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public StandardGoer update(StandardGoer standardGoer) {
        return this.repo.save(standardGoer);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
