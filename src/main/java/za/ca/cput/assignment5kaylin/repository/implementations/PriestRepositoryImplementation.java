package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.Priest;
import za.ca.cput.assignment5kaylin.repository.PriestRepository;

import java.util.HashSet;
import java.util.Set;

public class PriestRepositoryImplementation implements PriestRepository
{
    private static PriestRepositoryImplementation classRepository = null;
    private Set<Priest> prie;

    private PriestRepositoryImplementation()
    {
        this.prie = new HashSet<>();
    }

    public static PriestRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new PriestRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Set<Priest> getAll() {
        return this.prie;
    }

    @Override
    public Priest create(Priest priest) {
        this.prie.add(priest);
        return priest;
    }

    @Override
    public Priest read(String s) {
        Priest got = null;
        for (Priest cla: prie){
            if (cla.getInductDate().equals(s)) {
                System.out.println(cla.getInductDate() + cla.getSal());
                got = new Priest.Builder().inductDate(s).sal(cla.getSal()).build();
            }
        }

        return got;
    }

    @Override
    public Priest update(Priest priest) {
        if (prie.contains(priest))
        {
            prie.remove(priest);
            priest = new Priest.Builder().inductDate(priest.getInductDate()).sal(priest.getSal()).build();
            this.prie.add(priest);
        }
        //}
        return priest;
    }

    @Override
    public void delete(String s) {
        for (Priest cla: prie)
        {
            if (cla.getInductDate().equals(s))
            {
                this.prie.remove(cla);
            }
        }
    }
}
