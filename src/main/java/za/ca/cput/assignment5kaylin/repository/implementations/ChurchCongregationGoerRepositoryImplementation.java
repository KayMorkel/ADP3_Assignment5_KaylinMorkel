package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.ChurchCongregationGoer;
import za.ca.cput.assignment5kaylin.repository.ChurchCongregationGoerRepository;

import java.util.HashSet;
import java.util.Set;

public class ChurchCongregationGoerRepositoryImplementation implements ChurchCongregationGoerRepository
{
    private static ChurchCongregationGoerRepositoryImplementation classRepository = null;
    private Set<ChurchCongregationGoer> ccg;

    private ChurchCongregationGoerRepositoryImplementation()
    {
        this.ccg = new HashSet<>();
    }

    public static ChurchCongregationGoerRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new ChurchCongregationGoerRepositoryImplementation();
        return classRepository;

    }

    @Override
    public ChurchCongregationGoer create(ChurchCongregationGoer churchCongregationGoer) {
        this.ccg.add(churchCongregationGoer);
        return churchCongregationGoer;
    }

    @Override
    public ChurchCongregationGoer read(String s) {
        ChurchCongregationGoer got = null;
        for (ChurchCongregationGoer cla: ccg){
            if (cla.getGoerId().equals(s)) {
                System.out.println(cla.getGoerId() + cla.getGoerType());
                got = new ChurchCongregationGoer.Builder().goerId(s).goerType(cla.getGoerType()).build();
            }
        }

        return got;
    }

    @Override
    public ChurchCongregationGoer update(ChurchCongregationGoer churchCongregationGoer) {
        //for (Class cla: classes){
        if (ccg.contains(churchCongregationGoer))
        {
            ccg.remove(churchCongregationGoer);
            churchCongregationGoer = new ChurchCongregationGoer.Builder().goerId(churchCongregationGoer.getGoerId()).goerType(churchCongregationGoer.getGoerType()).build();
            this.ccg.add(churchCongregationGoer);
        }
        //}
        return churchCongregationGoer;
    }

    @Override
    public void delete(String s)
    {
        for (ChurchCongregationGoer cla: ccg)
        {
            if (cla.getGoerId().equals(s))
            {
                this.ccg.remove(cla);
            }
        }

    }

    @Override
    public Set<ChurchCongregationGoer> getAll() {
        return this.ccg;
    }
}
