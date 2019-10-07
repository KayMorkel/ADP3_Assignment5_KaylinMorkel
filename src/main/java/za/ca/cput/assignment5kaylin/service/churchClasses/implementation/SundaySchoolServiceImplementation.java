package za.ca.cput.assignment5kaylin.service.churchClasses.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchClasses.SundaySchool;
import za.ca.cput.assignment5kaylin.repository.churchClasses.SundaySchoolRepository;
//import za.ca.cput.assignment5kaylin.repository.churchClasses.implementations.SundaySchoolRepositoryImplmentation;
import za.ca.cput.assignment5kaylin.service.churchClasses.SundaySchoolService;

import java.util.List;
import java.util.Set;

@Service
public class SundaySchoolServiceImplementation implements SundaySchoolService
{
    @Autowired
    private SundaySchoolRepository repo;

    private static SundaySchoolServiceImplementation service = null;
    //private SundaySchoolRepository repo;

    private SundaySchoolServiceImplementation()
    {
      //  this.repo = SundaySchoolRepositoryImplmentation.getRepository();
    }

    public static SundaySchoolServiceImplementation getService()
    {
        if(service == null) service = new SundaySchoolServiceImplementation();
        return service;
    }

    @Override
    public SundaySchool retrieveById(String id) {
        List<SundaySchool> churches = getAll();
        for(SundaySchool c: churches)
        {
            if (c.getClassNo().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<SundaySchool> getAll() {
        return this.repo.findAll();
    }

    @Override
    public SundaySchool create(SundaySchool sundaySchool) {
        return this.repo.save(sundaySchool);
    }

    @Override
    public SundaySchool read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public SundaySchool update(SundaySchool sundaySchool) {
        return this.repo.save(sundaySchool);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
