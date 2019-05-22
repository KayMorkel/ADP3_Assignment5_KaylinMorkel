package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.LayMinister;
import za.ca.cput.assignment5kaylin.repository.churchPersons.LayMinisterRepository;
import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.LayMinisterRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.LayMinisterService;

import java.util.Set;

@Service
public class LayMinisterServiceImplementation implements LayMinisterService
{
    @Autowired
    private LayMinisterRepositoryImplementation repo;

    /*private static LayMinisterServiceImplementation service = null;
    private LayMinisterRepository repo;

    private LayMinisterServiceImplementation()
    {
        this.repo = LayMinisterRepositoryImplementation.getRepository();
    }

    public static LayMinisterServiceImplementation getService()
    {
        if(service == null) service = new LayMinisterServiceImplementation();
        return service;
    }*/

    @Override
    public Set<LayMinister> getAll() {
        return this.repo.getAll();
    }

    @Override
    public LayMinister create(LayMinister layMinister) {
        return this.repo.create(layMinister);
    }

    @Override
    public LayMinister read(String s) {
        return this.repo.read(s);
    }

    @Override
    public LayMinister update(LayMinister layMinister) {
        return this.repo.update(layMinister);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
