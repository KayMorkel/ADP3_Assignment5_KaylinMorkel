package za.ca.cput.assignment5kaylin.repository.churchPersons.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchPersons.StandardGoer;
import za.ca.cput.assignment5kaylin.factory.churchPersons.StandardGoerFactory;
import za.ca.cput.assignment5kaylin.repository.churchPersons.StandardGoerRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class StandardGoerRepositoryImplementation implements StandardGoerRepository
{
    private static StandardGoerRepositoryImplementation classRepository = null;
    private Set<StandardGoer> stand;

    private StandardGoerRepositoryImplementation()
    {
        this.stand = new HashSet<>();
    }

    public static StandardGoerRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new StandardGoerRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Set<StandardGoer> getAll() {
        return this.stand;
    }

    @Override
    public StandardGoer create(StandardGoer standardGoer) {
        this.stand.add(standardGoer);
        return standardGoer;
    }

    @Override
    public StandardGoer read(String s) {
        StandardGoer got = null;
        for (StandardGoer cla: stand){
            if (cla.getPledger().equals(s)) {
                System.out.println(cla.getPledger());
                got = StandardGoerFactory.getIsPledger(s);
            }
        }
        return got;
    }

    @Override
    public StandardGoer update(StandardGoer standardGoer) {
        if (stand.contains(standardGoer))
        {
            stand.remove(standardGoer);
            standardGoer = StandardGoerFactory.getIsPledger(standardGoer.getPledger());
            this.stand.add(standardGoer);
        }
        return standardGoer;
    }

    @Override
    public void delete(String s) {
        for (StandardGoer cla: stand)
        {
            if (cla.getPledger().equals(s))
            {
                this.stand.remove(cla);
                break;
            }
        }
    }
}
