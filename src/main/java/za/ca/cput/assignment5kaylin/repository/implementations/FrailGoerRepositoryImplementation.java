package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.FrailGoer;
import za.ca.cput.assignment5kaylin.repository.FrailGoerRepository;

import java.util.HashSet;
import java.util.Set;

public class FrailGoerRepositoryImplementation implements FrailGoerRepository
{
    private static FrailGoerRepositoryImplementation classRepository = null;
    private Set<FrailGoer> frail;

    private FrailGoerRepositoryImplementation()
    {
        this.frail = new HashSet<>();
    }

    public static FrailGoerRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new FrailGoerRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Set<FrailGoer> getAll() {
        return this.frail;
    }

    @Override
    public FrailGoer create(FrailGoer frailGoer) {
        this.frail.add(frailGoer);
        return frailGoer;
    }

    @Override
    public FrailGoer read(String s) {
        FrailGoer got = null;
        for (FrailGoer cla: frail){
            if (cla.getFrailNum().equals(s)) {
                System.out.println(cla.getFrailNum() + cla.getType());
                got = new FrailGoer.Builder().frailNum(s).type(cla.getType()).build();
            }
        }

        return got;
    }

    @Override
    public FrailGoer update(FrailGoer frailGoer) {
        if (frail.contains(frailGoer))
        {
            frail.remove(frailGoer);
            frailGoer = new FrailGoer.Builder().frailNum(frailGoer.getFrailNum()).type(frailGoer.getType()).build();
            this.frail.add(frailGoer);
        }
        //}
        return frailGoer;
    }

    @Override
    public void delete(String s) {
        for (FrailGoer cla: frail)
        {
            if (cla.getFrailNum().equals(s))
            {
                this.frail.remove(cla);
            }
        }
    }
}
