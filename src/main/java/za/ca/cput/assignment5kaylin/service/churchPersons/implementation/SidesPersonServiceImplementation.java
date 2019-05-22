package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.SidesPerson;
import za.ca.cput.assignment5kaylin.repository.churchPersons.SidesPersonRepository;
import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.SidesPersonRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.SidesPersonService;

import java.util.Set;

@Service
public class SidesPersonServiceImplementation implements SidesPersonService
{
    @Autowired
    private SidesPersonRepositoryImplementation repo;

    /*private static SidesPersonServiceImplementation service = null;
    private SidesPersonRepository repo;

    private SidesPersonServiceImplementation()
    {
        this.repo = SidesPersonRepositoryImplementation.getRepository();
    }

    public static SidesPersonServiceImplementation getService()
    {
        if(service == null) service = new SidesPersonServiceImplementation();
        return service;
    }*/

    @Override
    public Set<SidesPerson> getAll() {
        return this.repo.getAll();
    }

    @Override
    public SidesPerson create(SidesPerson sidesPerson) {
        return this.repo.create(sidesPerson);
    }

    @Override
    public SidesPerson read(String s) {
        return this.repo.read(s);
    }

    @Override
    public SidesPerson update(SidesPerson sidesPerson) {
        return this.repo.update(sidesPerson);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
