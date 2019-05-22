package za.ca.cput.assignment5kaylin.service.churchClasses.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchClasses.ConfirmationClass;
import za.ca.cput.assignment5kaylin.repository.churchClasses.ConfirmationClassRepository;
import za.ca.cput.assignment5kaylin.repository.churchClasses.implementations.ConfirmationClassRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchClasses.ConfirmationClassService;

import java.util.Set;

@Service
public class ConfirmationClassServiceImplementation implements ConfirmationClassService
{
    @Autowired
    private ConfirmationClassRepositoryImplementation repo;

    /*private static ConfirmationClassServiceImplementation service = null;
    private ConfirmationClassRepository repo;

    private ConfirmationClassServiceImplementation()
    {
        this.repo = ConfirmationClassRepositoryImplementation.getRepository();
    }

    public static ConfirmationClassServiceImplementation getService()
    {
        if(service == null) service = new ConfirmationClassServiceImplementation();
        return service;
    }*/

    @Override
    public Set<ConfirmationClass> getAll() {
        return this.repo.getAll();
    }

    @Override
    public ConfirmationClass create(ConfirmationClass confirmationClass) {
        return this.repo.create(confirmationClass);
    }

    @Override
    public ConfirmationClass read(String s) {
        return this.repo.read(s);
    }

    @Override
    public ConfirmationClass update(ConfirmationClass confirmationClass) {
        return this.repo.update(confirmationClass);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
