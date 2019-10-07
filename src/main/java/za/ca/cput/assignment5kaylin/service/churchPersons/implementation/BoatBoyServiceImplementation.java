package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.BoatBoy;
import za.ca.cput.assignment5kaylin.repository.churchPersons.BoatBoyRepository;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.BoatBoyRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.BoatBoyService;

import java.util.List;
import java.util.Set;

@Service
public class BoatBoyServiceImplementation implements BoatBoyService
{
    @Autowired
    private BoatBoyRepository repo;
    //Here below is manual wiring
    private static BoatBoyServiceImplementation service = null;
    //private BoatBoyRepository repo;

    private BoatBoyServiceImplementation()
    {
      //  this.repo = BoatBoyRepositoryImplementation.getRepository();
    }

    public static BoatBoyServiceImplementation getService()
    {
        if(service == null) service = new BoatBoyServiceImplementation();
        return service;
    }

    @Override
    public BoatBoy create(BoatBoy boatBoy) {
        return this.repo.save(boatBoy);
    }

    @Override
    public BoatBoy read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public BoatBoy update(BoatBoy boatBoy) {
        return this.repo.save(boatBoy);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }

    @Override
    public BoatBoy retrieveById(String id) {
        List<BoatBoy> churches = getAll();
        for(BoatBoy c: churches)
        {
            if (c.getSal().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<BoatBoy> getAll() {
        return this.repo.findAll();
    }
}
