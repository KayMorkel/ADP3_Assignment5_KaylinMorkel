package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.MarriedGoer;
import za.ca.cput.assignment5kaylin.repository.MarriedGoerRepository;

import java.util.HashSet;
import java.util.Set;

public class MarriedGoerRepositoryImplementation implements MarriedGoerRepository
{
    private static MarriedGoerRepositoryImplementation classRepository = null;
    private Set<MarriedGoer> mar;

    private MarriedGoerRepositoryImplementation()
    {
        this.mar = new HashSet<>();
    }

    public static MarriedGoerRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new MarriedGoerRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Set<MarriedGoer> getAll() {
        return this.mar;
    }

    @Override
    public MarriedGoer create(MarriedGoer marriedGoer) {
        this.mar.add(marriedGoer);
        return marriedGoer;
    }

    @Override
    public MarriedGoer read(String s) {
        MarriedGoer got = null;
        for (MarriedGoer cla: mar){
            if (cla.getId().equals(s)) {
                System.out.println(cla.getId() + cla.getYearMarried());
                got = new MarriedGoer.Builder().id(s).yearMarried(cla.getYearMarried()).build();
            }
        }

        return got;
    }

    @Override
    public MarriedGoer update(MarriedGoer marriedGoer) {
        if (mar.contains(marriedGoer))
        {
            mar.remove(marriedGoer);
            marriedGoer = new MarriedGoer.Builder().id(marriedGoer.getId()).yearMarried(marriedGoer.getYearMarried()).build();
            this.mar.add(marriedGoer);
        }
        //}
        return marriedGoer;
    }

    @Override
    public void delete(String s) {
        for (MarriedGoer cla: mar)
        {
            if (cla.getId().equals(s))
            {
                this.mar.remove(cla);
            }
        }
    }
}
