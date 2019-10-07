package za.ca.cput.assignment5kaylin.service.churchAdmin.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Church;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.ChurchRepository;
//import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.ChurchRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchAdmin.ChurchService;

import java.util.List;
import java.util.Set;

@Service
public class ChurchServiceImplementation implements ChurchService
{
    private static ChurchService service = null;

    @Autowired
    private ChurchRepository repo;


    //private ChurchRepository repo;

    private ChurchServiceImplementation()
    {
    }

    public static ChurchService getService()
    {
        if(service == null) service = new ChurchServiceImplementation();
        return service;
    }

    @Override
    public Church retrieveById(String id)
    {
        List<Church> churches = getAll();
        for(Church c: churches)
        {
            if (c.getChurchId().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<Church> getAll() {
        return this.repo.findAll();
    }

    @Override
    public Church create(Church church) {
        return this.repo.save(church);
    }

    @Override
    public Church read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public Church update(Church church) {
        return this.repo.save(church);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
