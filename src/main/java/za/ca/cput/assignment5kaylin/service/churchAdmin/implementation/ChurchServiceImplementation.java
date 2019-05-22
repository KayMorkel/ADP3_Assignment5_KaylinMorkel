package za.ca.cput.assignment5kaylin.service.churchAdmin.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Church;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.ChurchRepository;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.ChurchRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchAdmin.ChurchService;

import java.util.Set;

@Service
public class ChurchServiceImplementation implements ChurchService
{
    @Autowired
    private ChurchRepositoryImplementation repo;

    /*private static ChurchServiceImplementation service = null;
    private ChurchRepository repo;

    private ChurchServiceImplementation()
    {
        this.repo = ChurchRepositoryImplementation.getRepository();
    }

    public static ChurchServiceImplementation getService()
    {
        if(service == null) service = new ChurchServiceImplementation();
        return service;
    }*/

    @Override
    public Set<Church> getAll() {
        return this.repo.getAll();
    }

    @Override
    public Church create(Church church) {
        return this.repo.create(church);
    }

    @Override
    public Church read(String s) {
        return this.repo.read(s);
    }

    @Override
    public Church update(Church church) {
        return this.repo.update(church);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
