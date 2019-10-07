package za.ca.cput.assignment5kaylin.service.churchAdmin.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.ServiceSchedule;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.ServiceScheduleRepository;
//import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.ServiceScheduleRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchAdmin.ServiceScheduleService;

import java.util.List;
import java.util.Set;

@Service
public class ServiceScheduleServiceImplementation implements ServiceScheduleService
{
    @Autowired
    private ServiceScheduleRepository repo;

    private static ServiceScheduleServiceImplementation service = null;
    //private ServiceScheduleRepository repo;

    private ServiceScheduleServiceImplementation()
    {
      //  this.repo = ServiceScheduleRepositoryImplementation.getRepository();
    }

    public static ServiceScheduleServiceImplementation getService()
    {
        if(service == null) service = new ServiceScheduleServiceImplementation();
        return service;
    }

    @Override
    public ServiceSchedule retrieveById(String id) {
        List<ServiceSchedule> churches = getAll();
        for(ServiceSchedule c: churches)
        {
            if (c.getId().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<ServiceSchedule> getAll() {
        return this.repo.findAll();
    }

    @Override
    public ServiceSchedule create(ServiceSchedule serviceSchedule) {
        return this.repo.save(serviceSchedule);
    }

    @Override
    public ServiceSchedule read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public ServiceSchedule update(ServiceSchedule serviceSchedule) {
        return this.repo.save(serviceSchedule);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
