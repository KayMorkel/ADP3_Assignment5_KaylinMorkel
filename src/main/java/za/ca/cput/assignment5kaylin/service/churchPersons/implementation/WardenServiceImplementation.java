package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Warden;
import za.ca.cput.assignment5kaylin.repository.churchPersons.WardenRepository;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.WardenRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.WardenService;

import java.util.List;
import java.util.Set;

@Service
public class WardenServiceImplementation implements WardenService
{
    @Autowired
    private WardenRepository repo;

    private static WardenServiceImplementation service = null;
    //private WardenRepository repo;

    private WardenServiceImplementation()
    {
      //  this.repo = WardenRepositoryImplementation.getRepository();
    }

    public static WardenServiceImplementation getService()
    {
        if(service == null) service = new WardenServiceImplementation();
        return service;
    }

    @Override
    public Warden retrieveById(String id) {
        List<Warden> churches = getAll();
        for(Warden c: churches)
        {
            if (c.getWardenName().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<Warden> getAll() {
        return this.repo.findAll();
    }

    @Override
    public Warden create(Warden warden) {
        return this.repo.save(warden);
    }

    @Override
    public Warden read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public Warden update(Warden warden) {
        return this.repo.save(warden);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
