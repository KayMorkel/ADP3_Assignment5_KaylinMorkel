package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.StandardGoer;
import za.ca.cput.assignment5kaylin.repository.StandardGoerRepository;

import java.util.HashSet;
import java.util.Set;

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
                got = new StandardGoer.Builder().pledger(s).build();
            }
        }
        return got;
    }

    @Override
    public StandardGoer update(StandardGoer standardGoer) {
        if (stand.contains(standardGoer))
        {
            stand.remove(standardGoer);
            standardGoer = new StandardGoer.Builder().pledger(standardGoer.getPledger()).build();
            this.stand.add(standardGoer);
        }
        //}
        return standardGoer;
    }

    @Override
    public void delete(String s) {
        for (StandardGoer cla: stand)
        {
            if (cla.getPledger().equals(s))
            {
                this.stand.remove(cla);
            }
        }
    }
}
