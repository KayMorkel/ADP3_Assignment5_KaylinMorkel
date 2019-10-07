/*package za.ca.cput.assignment5kaylin.repository.churchPersons.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchPersons.DeceasedGoer;
import za.ca.cput.assignment5kaylin.factory.churchPersons.DeceasedGoerFactory;
import za.ca.cput.assignment5kaylin.repository.churchPersons.DeceasedGoerRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
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
                System.out.println(cla.getDecNum() + " " + cla.getYearDied());
                got = DeceasedGoerFactory.getDeceased(s, cla.getYearDied());
            }
        }

        return got;
    }

    @Override
    public DeceasedGoer update(DeceasedGoer deceasedGoer) {
        if (decGo.contains(deceasedGoer))
        {
            decGo.remove(deceasedGoer);
            deceasedGoer = DeceasedGoerFactory.getDeceased(deceasedGoer.getDecNum(), deceasedGoer.getYearDied());
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
                break;
            }
        }

    }
}*/
