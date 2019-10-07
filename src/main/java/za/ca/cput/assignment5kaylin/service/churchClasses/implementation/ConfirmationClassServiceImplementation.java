package za.ca.cput.assignment5kaylin.service.churchClasses.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchClasses.ConfirmationClass;
import za.ca.cput.assignment5kaylin.repository.churchClasses.ConfirmationClassRepository;
//import za.ca.cput.assignment5kaylin.repository.churchClasses.implementations.ConfirmationClassRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchClasses.ConfirmationClassService;

import java.util.List;
import java.util.Set;

@Service
public class ConfirmationClassServiceImplementation implements ConfirmationClassService
{
    @Autowired
    private ConfirmationClassRepository repo;

    private static ConfirmationClassServiceImplementation service = null;

    //private ConfirmationClassRepository repo;

    private ConfirmationClassServiceImplementation()
    {
      //  this.repo = ConfirmationClassRepositoryImplementation.getRepository();
    }

    public static ConfirmationClassServiceImplementation getService()
    {
        if(service == null) service = new ConfirmationClassServiceImplementation();
        return service;
    }

    @Override
    public ConfirmationClass retrieveById(String id) {
        List<ConfirmationClass> churches = getAll();
        for(ConfirmationClass c: churches)
        {
            if (c.getClassNo().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<ConfirmationClass> getAll() {
        return this.repo.findAll();
    }

    @Override
    public ConfirmationClass create(ConfirmationClass confirmationClass) {
        return this.repo.save(confirmationClass);
    }

    @Override
    public ConfirmationClass read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public ConfirmationClass update(ConfirmationClass confirmationClass) {
        return this.repo.save(confirmationClass);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
