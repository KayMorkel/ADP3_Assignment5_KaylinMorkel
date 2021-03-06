/*package za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.ServiceSchedule;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.ServiceScheduleFactory;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.ServiceScheduleRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
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
                System.out.println(cla.getId() + " " + cla.getType());
                got = ServiceScheduleFactory.getSS(s, cla.getType());
            }
        }
        return got;
    }

    @Override
    public ServiceSchedule update(ServiceSchedule serviceSchedule) {
        if (serv.contains(serviceSchedule))
        {
            serv.remove(serviceSchedule);
            serviceSchedule = ServiceScheduleFactory.getSS(serviceSchedule.getId(), serviceSchedule.getType());
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
                break;
            }
        }
    }
}*/
