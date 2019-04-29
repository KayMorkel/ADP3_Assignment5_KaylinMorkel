package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.DeceasedGoer;
import za.ca.cput.assignment5kaylin.repository.DeceasedGoerRepository;

import java.util.HashSet;
import java.util.Set;

public class DeceasedGoerRepositoryImplementation implements DeceasedGoerRepository
{
    private static DeceasedGoerRepositoryImplementation classRepository = null;
    private Set<DeceasedGoer> decGo;

    private DeceasedGoerRepositoryImplementation()
    {
        this.decGo = new HashSet<>();
    }

    public static DeceasedGoerRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new DeceasedGoerRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Set<DeceasedGoer> getAll() {
        return this.decGo;
    }

    @Override
    public DeceasedGoer create(DeceasedGoer deceasedGoer) {
        this.decGo.add(deceasedGoer);
        return deceasedGoer;
    }

    @Override
    public DeceasedGoer read(String s) {
        DeceasedGoer got = null;
        for (DeceasedGoer cla: decGo){
            if (cla.getDecNum().equals(s)) {
                System.out.println(cla.getDecNum() + cla.getYearDied());
                got = new DeceasedGoer.Builder().decNum(s).yearDied(cla.getYearDied()).build();
            }
        }

        return got;
    }

    @Override
    public DeceasedGoer update(DeceasedGoer deceasedGoer) {
        if (decGo.contains(deceasedGoer))
        {
            decGo.remove(deceasedGoer);
            deceasedGoer = new DeceasedGoer.Builder().decNum(deceasedGoer.getDecNum()).yearDied(deceasedGoer.getYearDied()).build();
            this.decGo.add(deceasedGoer);
        }
        //}
        return deceasedGoer;
    }

    @Override
    public void delete(String s) {
        for (DeceasedGoer cla: decGo)
        {
            if (cla.getDecNum().equals(s))
            {
                this.decGo.remove(cla);
            }
        }

    }
}
