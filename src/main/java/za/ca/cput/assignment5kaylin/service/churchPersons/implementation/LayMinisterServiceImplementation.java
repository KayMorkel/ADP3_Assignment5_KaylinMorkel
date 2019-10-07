package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.LayMinister;
import za.ca.cput.assignment5kaylin.repository.churchPersons.LayMinisterRepository;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.LayMinisterRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.LayMinisterService;

import java.util.List;
import java.util.Set;

@Service
public class LayMinisterServiceImplementation implements LayMinisterService
{
    @Autowired
    private LayMinisterRepository repo;

    private static LayMinisterServiceImplementation service = null;
    //private LayMinisterRepository repo;

    private LayMinisterServiceImplementation()
    {
      //  this.repo = LayMinisterRepositoryImplementation.getRepository();
    }

    public static LayMinisterServiceImplementation getService()
    {
        if(service == null) service = new LayMinisterServiceImplementation();
        return service;
    }

    @Override
    public LayMinister retrieveById(String id) {
        List<LayMinister> churches = getAll();
        for(LayMinister c: churches)
        {
            if (c.getId().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<LayMinister> getAll() {
        return this.repo.findAll();
    }

    @Override
    public LayMinister create(LayMinister layMinister) {
        return this.repo.save(layMinister);
    }

    @Override
    public LayMinister read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public LayMinister update(LayMinister layMinister) {
        return this.repo.save(layMinister);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
