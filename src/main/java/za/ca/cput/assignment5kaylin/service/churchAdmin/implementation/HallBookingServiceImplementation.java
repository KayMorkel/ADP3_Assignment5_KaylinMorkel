package za.ca.cput.assignment5kaylin.service.churchAdmin.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.HallBooking;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.HallBookingRepository;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.HallBookingRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchAdmin.HallBookingService;

import java.util.Set;

@Service
public class HallBookingServiceImplementation implements HallBookingService
{
    @Autowired
    private HallBookingRepositoryImplementation repo;

    /*private static HallBookingServiceImplementation service = null;
    private HallBookingRepository repo;

    private HallBookingServiceImplementation()
    {
        this.repo = HallBookingRepositoryImplementation.getRepository();
    }

    public static HallBookingServiceImplementation getService()
    {
        if(service == null) service = new HallBookingServiceImplementation();
        return service;
    }*/

    @Override
    public Set<HallBooking> getAll() {
        return this.repo.getAll();
    }

    @Override
    public HallBooking create(HallBooking hallBooking) {
        return this.repo.create(hallBooking);
    }

    @Override
    public HallBooking read(String s) {
        return this.repo.read(s);
    }

    @Override
    public HallBooking update(HallBooking hallBooking) {
        return this.repo.update(hallBooking);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
