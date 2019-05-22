package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.FrailGoer;
import za.ca.cput.assignment5kaylin.repository.churchPersons.FrailGoerRepository;
import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.FrailGoerRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.FrailGoerService;

import java.util.Set;

@Service
public class FrailGoerServiceImplementation implements FrailGoerService
{
    @Autowired
    private FrailGoerRepositoryImplementation repo;

    /*private static FrailGoerServiceImplementation service = null;
    private FrailGoerRepository repo;

    private FrailGoerServiceImplementation()
    {
        this.repo = FrailGoerRepositoryImplementation.getRepository();
    }

    public static FrailGoerServiceImplementation getService()
    {
        if(service == null) service = new FrailGoerServiceImplementation();
        return service;
    }*/

    @Override
    public Set<FrailGoer> getAll() {
        return this.repo.getAll();
    }

    @Override
    public FrailGoer create(FrailGoer frailGoer) {
        return this.repo.create(frailGoer);
    }

    @Override
    public FrailGoer read(String s) {
        return this.repo.read(s);
    }

    @Override
    public FrailGoer update(FrailGoer frailGoer) {
        return this.repo.update(frailGoer);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
