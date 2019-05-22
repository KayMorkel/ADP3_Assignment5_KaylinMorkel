package za.ca.cput.assignment5kaylin.service.churchAdmin.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.YearEvent;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.YearEventRepository;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.YearEventRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchAdmin.YearEventService;

import java.util.Set;

@Service
public class YearEventServiceImplementation implements YearEventService
{
    @Autowired
    private YearEventRepositoryImplementation repo;

    /*private static YearEventServiceImplementation service = null;
    private YearEventRepository repo;

    private YearEventServiceImplementation()
    {
        this.repo = YearEventRepositoryImplementation.getRepository();
    }

    public static YearEventServiceImplementation getService()
    {
        if(service == null) service = new YearEventServiceImplementation();
        return service;
    }*/

    @Override
    public Set<YearEvent> getAll() {
        return this.repo.getAll();
    }

    @Override
    public YearEvent create(YearEvent yearEvent) {
        return this.repo.create(yearEvent);
    }

    @Override
    public YearEvent read(String s) {
        return this.repo.read(s);
    }

    @Override
    public YearEvent update(YearEvent yearEvent) {
        return this.repo.update(yearEvent);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
