package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.StandardGoer;
import za.ca.cput.assignment5kaylin.repository.churchPersons.StandardGoerRepository;
import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.StandardGoerRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.StandardGoerService;

import java.util.Set;

@Service
public class StandardGoerServiceImplementation implements StandardGoerService
{
    @Autowired
    private StandardGoerRepositoryImplementation repo;

    /*private static StandardGoerServiceImplementation service = null;
    private StandardGoerRepository repo;

    private StandardGoerServiceImplementation()
    {
        this.repo = StandardGoerRepositoryImplementation.getRepository();
    }

    public static StandardGoerServiceImplementation getService()
    {
        if(service == null) service = new StandardGoerServiceImplementation();
        return service;
    }*/

    @Override
    public Set<StandardGoer> getAll() {
        return this.repo.getAll();
    }

    @Override
    public StandardGoer create(StandardGoer standardGoer) {
        return this.repo.create(standardGoer);
    }

    @Override
    public StandardGoer read(String s) {
        return this.repo.read(s);
    }

    @Override
    public StandardGoer update(StandardGoer standardGoer) {
        return this.repo.update(standardGoer);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
