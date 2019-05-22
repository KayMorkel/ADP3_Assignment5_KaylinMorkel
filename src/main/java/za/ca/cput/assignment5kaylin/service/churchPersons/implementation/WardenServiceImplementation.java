package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Warden;
import za.ca.cput.assignment5kaylin.repository.churchPersons.WardenRepository;
import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.WardenRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.WardenService;

import java.util.Set;

@Service
public class WardenServiceImplementation implements WardenService
{
    @Autowired
    private WardenRepositoryImplementation repo;

    /*private static WardenServiceImplementation service = null;
    private WardenRepository repo;

    private WardenServiceImplementation()
    {
        this.repo = WardenRepositoryImplementation.getRepository();
    }

    public static WardenServiceImplementation getService()
    {
        if(service == null) service = new WardenServiceImplementation();
        return service;
    }*/

    @Override
    public Set<Warden> getAll() {
        return this.repo.getAll();
    }

    @Override
    public Warden create(Warden warden) {
        return this.repo.create(warden);
    }

    @Override
    public Warden read(String s) {
        return this.repo.read(s);
    }

    @Override
    public Warden update(Warden warden) {
        return this.repo.update(warden);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
