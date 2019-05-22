package za.ca.cput.assignment5kaylin.service.churchClasses.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchClasses.BibleClass;
import za.ca.cput.assignment5kaylin.repository.churchClasses.BibleClassRepository;
import za.ca.cput.assignment5kaylin.repository.churchClasses.implementations.BibleClassRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchClasses.BibleClassService;

import java.util.Set;

@Service
public class BibleClassServiceImplementation implements BibleClassService
{
    @Autowired
    private BibleClassRepositoryImplementation repo;

    /*private static BibleClassServiceImplementation service = null;
    private BibleClassRepository repo;

    private BibleClassServiceImplementation()
    {
        this.repo = BibleClassRepositoryImplementation.getRepository();
    }

    public static BibleClassServiceImplementation getService()
    {
        if(service == null) service = new BibleClassServiceImplementation();
        return service;
    }*/

    @Override
    public Set<BibleClass> getAll() {
        return this.repo.getAll();
    }

    @Override
    public BibleClass create(BibleClass bibleClass) {
        return this.repo.create(bibleClass);
    }

    @Override
    public BibleClass read(String s) {
        return this.repo.read(s);
    }

    @Override
    public BibleClass update(BibleClass bibleClass) {
        return this.repo.update(bibleClass);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
