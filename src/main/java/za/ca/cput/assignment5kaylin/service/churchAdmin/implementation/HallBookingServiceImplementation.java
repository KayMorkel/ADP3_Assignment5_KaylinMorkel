package za.ca.cput.assignment5kaylin.service.churchAdmin.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.HallBooking;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.HallBookingRepository;
//import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.HallBookingRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchAdmin.HallBookingService;

import java.util.List;

@Service
public class HallBookingServiceImplementation implements HallBookingService
{
    private static HallBookingService service = null;

    @Autowired
    private HallBookingRepository repo;


    //private HallBookingRepository repo;

    private HallBookingServiceImplementation()
    {
    }

    public static HallBookingService getService()
    {
        if(service == null) service = new HallBookingServiceImplementation();
        return service;
    }

    @Override
    public HallBooking create(HallBooking hallBooking) {
        return this.repo.save(hallBooking);
    }

    @Override
    public HallBooking read(String s)
    {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public HallBooking update(HallBooking hallBooking) {
        return this.repo.save(hallBooking);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }

    @Override
    public HallBooking retrieveById(String id) {
        List<HallBooking> hb = getAll();
        for (HallBooking hb1: hb)
        {
            if (hb1.getHallBookId().equals(id)) return hb1;
        }
        return null;
    }

    @Override
    public List<HallBooking> getAll() {
        return this.repo.findAll();
    }
}

