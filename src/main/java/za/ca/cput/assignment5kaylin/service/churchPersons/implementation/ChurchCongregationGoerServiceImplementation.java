package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.ChurchCongregationGoer;
import za.ca.cput.assignment5kaylin.repository.churchPersons.ChurchCongregationGoerRepository;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.ChurchCongregationGoerRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.ChurchCongregationGoerService;

import java.util.List;
import java.util.Set;

@Service
public class ChurchCongregationGoerServiceImplementation implements ChurchCongregationGoerService
{
    @Autowired
    private ChurchCongregationGoerRepository repo;

    private static ChurchCongregationGoerServiceImplementation service = null;
    //private ChurchCongregationGoerRepository repo;

    private ChurchCongregationGoerServiceImplementation()
    {
      //  this.repo = ChurchCongregationGoerRepositoryImplementation.getRepository();
    }

    public static ChurchCongregationGoerServiceImplementation getService()
    {
        if(service == null) service = new ChurchCongregationGoerServiceImplementation();
        return service;
    }

    @Override
    public ChurchCongregationGoer create(ChurchCongregationGoer churchCongregationGoer) {
        return this.repo.save(churchCongregationGoer);
    }

    @Override
    public ChurchCongregationGoer read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public ChurchCongregationGoer update(ChurchCongregationGoer churchCongregationGoer) {
        return this.repo.save(churchCongregationGoer);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }

    @Override
    public ChurchCongregationGoer retrieveById(String id) {
        List<ChurchCongregationGoer> churches = getAll();
        for(ChurchCongregationGoer c: churches)
        {
            if (c.getGoerId().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<ChurchCongregationGoer> getAll() {
        return this.repo.findAll();
    }
}
