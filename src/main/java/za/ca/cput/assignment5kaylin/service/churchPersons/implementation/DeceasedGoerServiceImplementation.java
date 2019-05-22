package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.DeceasedGoer;
import za.ca.cput.assignment5kaylin.repository.churchPersons.DeceasedGoerRepository;
import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.DeceasedGoerRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.DeceasedGoerService;

import java.util.Set;

@Service
public class DeceasedGoerServiceImplementation implements DeceasedGoerService
{
    @Autowired
    private DeceasedGoerRepositoryImplementation repo;

    /*private static DeceasedGoerServiceImplementation service = null;
    private DeceasedGoerRepository repo;

    private DeceasedGoerServiceImplementation()
    {
        this.repo = DeceasedGoerRepositoryImplementation.getRepository();
    }

    public static DeceasedGoerServiceImplementation getService()
    {
        if(service == null) service = new DeceasedGoerServiceImplementation();
        return service;
    }*/

    @Override
    public Set<DeceasedGoer> getAll() {
        return this.repo.getAll();
    }

    @Override
    public DeceasedGoer create(DeceasedGoer deceasedGoer) {
        return this.repo.create(deceasedGoer);
    }

    @Override
    public DeceasedGoer read(String s) {
        return this.repo.read(s);
    }

    @Override
    public DeceasedGoer update(DeceasedGoer deceasedGoer) {
        return this.repo.update(deceasedGoer);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
