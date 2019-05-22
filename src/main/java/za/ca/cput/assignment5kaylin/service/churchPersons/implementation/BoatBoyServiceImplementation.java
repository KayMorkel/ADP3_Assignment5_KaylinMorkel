package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.BoatBoy;
import za.ca.cput.assignment5kaylin.repository.churchPersons.BoatBoyRepository;
import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.BoatBoyRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.BoatBoyService;

import java.util.Set;

@Service
public class BoatBoyServiceImplementation implements BoatBoyService
{
    @Autowired
    private BoatBoyRepositoryImplementation repo;
    //Here below is manual wiring
    /*private static BoatBoyServiceImplementation service = null;
    private BoatBoyRepository repo;

    private BoatBoyServiceImplementation()
    {
        this.repo = BoatBoyRepositoryImplementation.getRepository();
    }

    public static BoatBoyServiceImplementation getService()
    {
        if(service == null) service = new BoatBoyServiceImplementation();
        return service;
    }*/

    @Override
    public BoatBoy create(BoatBoy boatBoy) {
        return this.repo.create(boatBoy);
    }

    @Override
    public BoatBoy read(String s) {
        return this.repo.read(s);
    }

    @Override
    public BoatBoy update(BoatBoy boatBoy) {
        return this.repo.update(boatBoy);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }

    @Override
    public Set<BoatBoy> getAll() {
        return this.repo.getAll();
    }
}
