package za.ca.cput.assignment5kaylin.service.churchAdmin.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.YearEvent;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.YearEventRepository;
//import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.YearEventRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchAdmin.YearEventService;

import java.util.List;
import java.util.Set;

@Service
public class YearEventServiceImplementation implements YearEventService
{
    @Autowired
    private YearEventRepository repo;

    private static YearEventServiceImplementation service = null;
    //private YearEventRepository repo;

    private YearEventServiceImplementation()
    {
      //  this.repo = YearEventRepositoryImplementation.getRepository();
    }

    public static YearEventServiceImplementation getService()
    {
        if(service == null) service = new YearEventServiceImplementation();
        return service;
    }

    @Override
    public YearEvent retrieveById(String id) {
        List<YearEvent> churches = getAll();
        for(YearEvent c: churches)
        {
            if (c.getEventNum().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<YearEvent> getAll() {
        return this.repo.findAll();
    }

    @Override
    public YearEvent create(YearEvent yearEvent) {
        return this.repo.save(yearEvent);
    }

    @Override
    public YearEvent read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public YearEvent update(YearEvent yearEvent) {
        return this.repo.save(yearEvent);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
