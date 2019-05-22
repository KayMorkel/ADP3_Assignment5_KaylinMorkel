package za.ca.cput.assignment5kaylin.service.churchAdmin.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.ServiceSchedule;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.ServiceScheduleRepository;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations.ServiceScheduleRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchAdmin.ServiceScheduleService;

import java.util.Set;

@Service
public class ServiceScheduleServiceImplementation implements ServiceScheduleService
{
    @Autowired
    private ServiceScheduleRepositoryImplementation repo;

    /*private static ServiceScheduleServiceImplementation service = null;
    private ServiceScheduleRepository repo;

    private ServiceScheduleServiceImplementation()
    {
        this.repo = ServiceScheduleRepositoryImplementation.getRepository();
    }

    public static ServiceScheduleServiceImplementation getService()
    {
        if(service == null) service = new ServiceScheduleServiceImplementation();
        return service;
    }*/

    @Override
    public Set<ServiceSchedule> getAll() {
        return this.repo.getAll();
    }

    @Override
    public ServiceSchedule create(ServiceSchedule serviceSchedule) {
        return this.repo.create(serviceSchedule);
    }

    @Override
    public ServiceSchedule read(String s) {
        return this.repo.read(s);
    }

    @Override
    public ServiceSchedule update(ServiceSchedule serviceSchedule) {
        return this.repo.update(serviceSchedule);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
