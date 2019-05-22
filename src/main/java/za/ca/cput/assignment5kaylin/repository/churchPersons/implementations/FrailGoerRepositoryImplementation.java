package za.ca.cput.assignment5kaylin.repository.churchPersons.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchPersons.FrailGoer;
import za.ca.cput.assignment5kaylin.factory.churchPersons.FrailGoerFactory;
import za.ca.cput.assignment5kaylin.repository.churchPersons.FrailGoerRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
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
                System.out.println(cla.getFrailNum() + " " + cla.getType());
                got = FrailGoerFactory.getFrailP(s, cla.getType());
            }
        }

        return got;
    }

    @Override
    public FrailGoer update(FrailGoer frailGoer) {
        if (frail.contains(frailGoer))
        {
            frail.remove(frailGoer);
            frailGoer = FrailGoerFactory.getFrailP(frailGoer.getFrailNum(), frailGoer.getType());
            this.frail.add(frailGoer);
        }
        return frailGoer;
    }

    @Override
    public void delete(String s) {
        for (FrailGoer cla: frail)
        {
            if (cla.getFrailNum().equals(s))
            {
                this.frail.remove(cla);
                break;
            }
        }
    }
}
