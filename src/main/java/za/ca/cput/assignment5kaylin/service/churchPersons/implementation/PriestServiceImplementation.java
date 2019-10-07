package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Priest;
import za.ca.cput.assignment5kaylin.repository.churchPersons.PriestRepository;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.PriestRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.PriestService;

import java.util.List;
import java.util.Set;

@Service
public class PriestServiceImplementation implements PriestService
{
    @Autowired
    private PriestRepository repo;

    private static PriestServiceImplementation service = null;
    //private PriestRepository repo;

    private PriestServiceImplementation()
    {
      //  this.repo = PriestRepositoryImplementation.getRepository();
    }

    public static PriestServiceImplementation getService()
    {
        if(service == null) service = new PriestServiceImplementation();
        return service;
    }

    @Override
    public Priest retrieveById(String id) {
        List<Priest> churches = getAll();
        for(Priest c: churches)
        {
            if (c.getSal().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<Priest> getAll() {
        return this.repo.findAll();
    }

    @Override
    public Priest create(Priest priest) {
        return this.repo.save(priest);
    }

    @Override
    public Priest read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public Priest update(Priest priest) {
        return this.repo.save(priest);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
