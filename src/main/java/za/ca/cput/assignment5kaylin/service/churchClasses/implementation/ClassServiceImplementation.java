package za.ca.cput.assignment5kaylin.service.churchClasses.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchClasses.Class;
import za.ca.cput.assignment5kaylin.repository.churchClasses.ClassRepository;
//import za.ca.cput.assignment5kaylin.repository.churchClasses.implementations.ClassRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchClasses.ClassService;

import java.util.List;
import java.util.Set;

@Service
public class ClassServiceImplementation implements ClassService
{
    @Autowired
    private ClassRepository repo;

    private static ClassServiceImplementation service = null;
    //private ClassRepository repo;

    private ClassServiceImplementation()
    {
      //  this.repo = ClassRepositoryImplementation.getRepository();
    }

    public static ClassServiceImplementation getService()
    {
        if(service == null) service = new ClassServiceImplementation();
        return service;
    }

    @Override
    public Class retrieveById(String id) {
        List<Class> churches = getAll();
        for(Class c: churches)
        {
            if (c.getClassId().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<Class> getAll() {
        return this.repo.findAll();
    }

    @Override
    public Class create(Class aClass) {
        return this.repo.save(aClass);
    }

    @Override
    public Class read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public Class update(Class aClass) {
        return this.repo.save(aClass);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
