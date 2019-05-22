package za.ca.cput.assignment5kaylin.repository.churchPersons.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchPersons.LayMinister;
import za.ca.cput.assignment5kaylin.factory.churchPersons.LayMinisterFactory;
import za.ca.cput.assignment5kaylin.repository.churchPersons.LayMinisterRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class LayMinisterRepositoryImplementation implements LayMinisterRepository
{
    private static LayMinisterRepositoryImplementation classRepository = null;
    private Set<LayMinister> laym;

    private LayMinisterRepositoryImplementation()
    {
        this.laym = new HashSet<>();
    }

    public static LayMinisterRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new LayMinisterRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Set<LayMinister> getAll() {
        return this.laym;
    }

    @Override
    public LayMinister create(LayMinister layMinister) {
        this.laym.add(layMinister);
        return layMinister;
    }

    @Override
    public LayMinister read(String s) {
        LayMinister got = null;
        for (LayMinister cla: laym){
            if (cla.getId().equals(s)) {
                System.out.println(cla.getId() + "  " +cla.getName());
                got = LayMinisterFactory.getLayMinister(s, cla.getName());
            }
        }

        return got;
    }

    @Override
    public LayMinister update(LayMinister layMinister) {
        if (laym.contains(layMinister))
        {
            laym.remove(layMinister);
            layMinister = LayMinisterFactory.getLayMinister(layMinister.getId(), layMinister.getName());
            this.laym.add(layMinister);
        }
        //}
        return layMinister;
    }

    @Override
    public void delete(String s) {
        for (LayMinister cla: laym)
        {
            if (cla.getId().equals(s))
            {
                this.laym.remove(cla);
                break;
            }
        }
    }
}
