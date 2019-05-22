package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Priest;
import za.ca.cput.assignment5kaylin.repository.churchPersons.PriestRepository;
import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.PriestRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.PriestService;

import java.util.Set;

@Service
public class PriestServiceImplementation implements PriestService
{
    @Autowired
    private PriestRepositoryImplementation repo;

    /*private static PriestServiceImplementation service = null;
    private PriestRepository repo;

    private PriestServiceImplementation()
    {
        this.repo = PriestRepositoryImplementation.getRepository();
    }

    public static PriestServiceImplementation getService()
    {
        if(service == null) service = new PriestServiceImplementation();
        return service;
    }*/

    @Override
    public Set<Priest> getAll() {
        return this.repo.getAll();
    }

    @Override
    public Priest create(Priest priest) {
        return this.repo.create(priest);
    }

    @Override
    public Priest read(String s) {
        return this.repo.read(s);
    }

    @Override
    public Priest update(Priest priest) {
        return this.repo.update(priest);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
