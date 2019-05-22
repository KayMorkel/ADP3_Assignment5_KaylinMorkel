package za.ca.cput.assignment5kaylin.service.churchClasses.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchClasses.SundaySchool;
import za.ca.cput.assignment5kaylin.repository.churchClasses.SundaySchoolRepository;
import za.ca.cput.assignment5kaylin.repository.churchClasses.implementations.SundaySchoolRepositoryImplmentation;
import za.ca.cput.assignment5kaylin.service.churchClasses.SundaySchoolService;

import java.util.Set;

@Service
public class SundaySchoolServiceImplementation implements SundaySchoolService
{
    @Autowired
    private SundaySchoolRepositoryImplmentation repo;

    /*private static SundaySchoolServiceImplementation service = null;
    private SundaySchoolRepository repo;

    private SundaySchoolServiceImplementation()
    {
        this.repo = SundaySchoolRepositoryImplmentation.getRepository();
    }

    public static SundaySchoolServiceImplementation getService()
    {
        if(service == null) service = new SundaySchoolServiceImplementation();
        return service;
    }*/

    @Override
    public Set<SundaySchool> getAll() {
        return this.repo.getAll();
    }

    @Override
    public SundaySchool create(SundaySchool sundaySchool) {
        return this.repo.create(sundaySchool);
    }

    @Override
    public SundaySchool read(String s) {
        return this.repo.read(s);
    }

    @Override
    public SundaySchool update(SundaySchool sundaySchool) {
        return this.repo.update(sundaySchool);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
