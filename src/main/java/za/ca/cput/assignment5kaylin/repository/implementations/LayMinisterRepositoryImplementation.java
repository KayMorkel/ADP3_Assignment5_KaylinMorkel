package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.LayMinister;
import za.ca.cput.assignment5kaylin.repository.LayMinisterRepository;

import java.util.HashSet;
import java.util.Set;

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
                System.out.println(cla.getId() + cla.getName());
                got = new LayMinister.Builder().id(s).name(cla.getName()).build();
            }
        }

        return got;
    }

    @Override
    public LayMinister update(LayMinister layMinister) {
        if (laym.contains(layMinister))
        {
            laym.remove(layMinister);
            layMinister = new LayMinister.Builder().id(layMinister.getId()).name(layMinister.getName()).build();
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
            }
        }
    }
}
