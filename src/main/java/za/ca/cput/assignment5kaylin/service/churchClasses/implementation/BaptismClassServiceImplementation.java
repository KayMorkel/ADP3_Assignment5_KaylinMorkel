package za.ca.cput.assignment5kaylin.service.churchClasses.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchClasses.BaptismClass;
import za.ca.cput.assignment5kaylin.repository.churchClasses.BaptismClassRepository;
//import za.ca.cput.assignment5kaylin.repository.churchClasses.implementations.BaptismClassRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchClasses.BaptismClassService;

import java.util.List;
import java.util.Set;

@Service
public class BaptismClassServiceImplementation implements BaptismClassService
{
    @Autowired
    private BaptismClassRepository repo;

    private static BaptismClassServiceImplementation service = null;
    //private BaptismClassRepository repo;

    private BaptismClassServiceImplementation()
    {
      //  this.repo = BaptismClassRepositoryImplementation.getRepository();
    }

    public static BaptismClassServiceImplementation getService()
    {
        if(service == null) service = new BaptismClassServiceImplementation();
        return service;
    }

    @Override
    public BaptismClass retrieveById(String id) {
        List<BaptismClass> churches = getAll();
        for(BaptismClass c: churches)
        {
            if (c.getClassNo().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<BaptismClass> getAll() {
        return this.repo.findAll();
    }

    @Override
    public BaptismClass create(BaptismClass baptismClass) {
        return this.repo.save(baptismClass);
    }

    @Override
    public BaptismClass read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public BaptismClass update(BaptismClass baptismClass) {
        return this.repo.save(baptismClass);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
