package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.ChurchCongregationGoer;
import za.ca.cput.assignment5kaylin.repository.churchPersons.ChurchCongregationGoerRepository;
import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.ChurchCongregationGoerRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.ChurchCongregationGoerService;

import java.util.Set;

@Service
public class ChurchCongregationGoerServiceImplementation implements ChurchCongregationGoerService
{
    @Autowired
    private ChurchCongregationGoerRepositoryImplementation repo;

    /*private static ChurchCongregationGoerServiceImplementation service = null;
    private ChurchCongregationGoerRepository repo;

    private ChurchCongregationGoerServiceImplementation()
    {
        this.repo = ChurchCongregationGoerRepositoryImplementation.getRepository();
    }

    public static ChurchCongregationGoerServiceImplementation getService()
    {
        if(service == null) service = new ChurchCongregationGoerServiceImplementation();
        return service;
    }*/

    @Override
    public ChurchCongregationGoer create(ChurchCongregationGoer churchCongregationGoer) {
        return this.repo.create(churchCongregationGoer);
    }

    @Override
    public ChurchCongregationGoer read(String s) {
        return this.repo.read(s);
    }

    @Override
    public ChurchCongregationGoer update(ChurchCongregationGoer churchCongregationGoer) {
        return this.repo.update(churchCongregationGoer);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }

    @Override
    public Set<ChurchCongregationGoer> getAll() {
        return this.repo.getAll();
    }
}
