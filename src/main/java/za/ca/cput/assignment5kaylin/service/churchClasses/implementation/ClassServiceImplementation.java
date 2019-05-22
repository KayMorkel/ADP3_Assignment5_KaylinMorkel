package za.ca.cput.assignment5kaylin.service.churchClasses.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchClasses.Class;
import za.ca.cput.assignment5kaylin.repository.churchClasses.ClassRepository;
import za.ca.cput.assignment5kaylin.repository.churchClasses.implementations.ClassRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchClasses.ClassService;

import java.util.Set;

@Service
public class ClassServiceImplementation implements ClassService
{
    @Autowired
    private ClassRepositoryImplementation repo;

    /*private static ClassServiceImplementation service = null;
    private ClassRepository repo;

    private ClassServiceImplementation()
    {
        this.repo = ClassRepositoryImplementation.getRepository();
    }

    public static ClassServiceImplementation getService()
    {
        if(service == null) service = new ClassServiceImplementation();
        return service;
    }*/

    @Override
    public Set<Class> getAll() {
        return this.repo.getAll();
    }

    @Override
    public Class create(Class aClass) {
        return this.repo.create(aClass);
    }

    @Override
    public Class read(String s) {
        return this.repo.read(s);
    }

    @Override
    public Class update(Class aClass) {
        return this.repo.update(aClass);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
