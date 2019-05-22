package za.ca.cput.assignment5kaylin.service.churchAdmin.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Collection;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.CollectionRepository;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.CollectionRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchAdmin.CollectionService;

import java.util.Set;

@Service
public class CollectionServiceImplementation implements CollectionService
{
    @Autowired
    private CollectionRepositoryImplementation repo;

    /*private static CollectionServiceImplementation service = null;
    private CollectionRepository repo;

    private CollectionServiceImplementation()
    {
        this.repo = CollectionRepositoryImplementation.getRepository();
    }

    public static CollectionServiceImplementation getService()
    {
        if(service == null) service = new CollectionServiceImplementation();
        return service;
    }*/

    @Override
    public Set<Collection> getAll() {
        return this.repo.getAll();
    }

    @Override
    public Collection create(Collection collection) {
        return this.repo.create(collection);
    }

    @Override
    public Collection read(String s) {
        return this.repo.read(s);
    }

    @Override
    public Collection update(Collection collection) {
        return this.repo.update(collection);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
