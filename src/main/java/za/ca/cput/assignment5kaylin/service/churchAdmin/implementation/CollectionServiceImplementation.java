package za.ca.cput.assignment5kaylin.service.churchAdmin.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Collection;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.CollectionRepository;
//import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.CollectionRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchAdmin.CollectionService;

import java.util.List;
import java.util.Set;

@Service
public class CollectionServiceImplementation implements CollectionService
{
    @Autowired
    private CollectionRepository repo;

    private static CollectionServiceImplementation service = null;
    //private CollectionRepository repo;

    private CollectionServiceImplementation()
    {
        //this.repo = CollectionRepositoryImplementation.getRepository();
    }

    public static CollectionServiceImplementation getService()
    {
        if(service == null) service = new CollectionServiceImplementation();
        return service;
    }

    @Override
    public Collection retrieveById(String id)
    {
        List<Collection> churches = getAll();
        for(Collection c: churches)
        {
            if (c.getCollectId().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<Collection> getAll() {
        return this.repo.findAll();
    }

    @Override
    public Collection create(Collection collection) {
        return this.repo.save(collection);
    }

    @Override
    public Collection read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public Collection update(Collection collection) {
        return this.repo.save(collection);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
