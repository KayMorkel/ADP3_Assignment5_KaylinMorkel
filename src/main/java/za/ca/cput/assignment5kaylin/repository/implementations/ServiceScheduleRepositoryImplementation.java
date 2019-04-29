package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.ServiceSchedule;
import za.ca.cput.assignment5kaylin.repository.ServiceScheduleRepository;

import java.util.HashSet;
import java.util.Set;

public class ServiceScheduleRepositoryImplementation implements ServiceScheduleRepository
{
    private static ServiceScheduleRepositoryImplementation classRepository = null;
    private Set<ServiceSchedule> serv;

    private ServiceScheduleRepositoryImplementation()
    {
        this.serv = new HashSet<>();
    }

    public static ServiceScheduleRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new ServiceScheduleRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Set<ServiceSchedule> getAll() {
        return this.serv;
    }

    @Override
    public ServiceSchedule create(ServiceSchedule serviceSchedule) {
        this.serv.add(serviceSchedule);
        return serviceSchedule;
    }

    @Override
    public ServiceSchedule read(String s) {
        ServiceSchedule got = null;
        for (ServiceSchedule cla: serv){
            if (cla.getId().equals(s)) {
                System.out.println(cla.getId() + cla.getType());
                got = new ServiceSchedule.Builder().id(s).type(cla.getType()).build();
            }
        }

        return got;
    }

    @Override
    public ServiceSchedule update(ServiceSchedule serviceSchedule) {
        if (serv.contains(serviceSchedule))
        {
            serv.remove(serviceSchedule);
            serviceSchedule = new ServiceSchedule.Builder().id(serviceSchedule.getId()).type(serviceSchedule.getType()).build();
            this.serv.add(serviceSchedule);
        }
        //}
        return serviceSchedule;
    }

    @Override
    public void delete(String s) {
        for (ServiceSchedule cla: serv)
        {
            if (cla.getId().equals(s))
            {
                this.serv.remove(cla);
            }
        }
    }
}
