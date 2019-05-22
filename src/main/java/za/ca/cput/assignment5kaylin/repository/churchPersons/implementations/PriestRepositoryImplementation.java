package za.ca.cput.assignment5kaylin.repository.churchPersons.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Priest;
import za.ca.cput.assignment5kaylin.factory.churchPersons.PriestFactory;
import za.ca.cput.assignment5kaylin.repository.churchPersons.PriestRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
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
            if (cla.getSal().equals(s)) {
                System.out.println(cla.getInductDate() + " " + cla.getSal());
                got = PriestFactory.getPriest(s, cla.getInductDate());
            }
        }
        return got;
    }

    @Override
    public Priest update(Priest priest) {
        if (prie.contains(priest))
        {
            prie.remove(priest);
            priest = PriestFactory.getPriest(priest.getInductDate(), priest.getSal());
            this.prie.add(priest);
        }
        //}
        return priest;
    }

    @Override
    public void delete(String s) {
        for (Priest cla: prie)
        {
            if (cla.getSal().equals(s))
            {
                this.prie.remove(cla);
                break;
            }
        }
    }
}
