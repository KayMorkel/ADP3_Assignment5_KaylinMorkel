package za.ca.cput.assignment5kaylin.repository.churchPersons.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchPersons.BoatBoy;
import za.ca.cput.assignment5kaylin.factory.churchPersons.BoatBoyFactory;
import za.ca.cput.assignment5kaylin.repository.churchPersons.BoatBoyRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class BoatBoyRepositoryImplementation implements BoatBoyRepository
{
    private static BoatBoyRepositoryImplementation classRepository = null;
    private Set<BoatBoy> bb;

    private BoatBoyRepositoryImplementation()
    {
        this.bb = new HashSet<>();
    }

    public static BoatBoyRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new BoatBoyRepositoryImplementation();
        return classRepository;

    }

    @Override
    public BoatBoy create(BoatBoy boatBoy) {
        this.bb.add(boatBoy);
        return boatBoy;
    }

    @Override
    public BoatBoy read(String s) {
        BoatBoy got = null;
        for (BoatBoy cla: bb){
            if (cla.getSal().equals(s)) {
                System.out.println(cla.getSal() + " " + cla.getPayType());
                got = BoatBoyFactory.getBB(s, cla.getPayType());
            }
        }
        return got;
    }

    @Override
    public BoatBoy update(BoatBoy boatBoy) {
        if (bb.contains(boatBoy))
        {
            bb.remove(boatBoy);
            boatBoy = BoatBoyFactory.getBB(boatBoy.getSal(), boatBoy.getPayType());
            this.bb.add(boatBoy);
        }
        return boatBoy;
    }

    @Override
    public void delete(String s)
    {
        for (BoatBoy cla: bb)
        {
            if (cla.getSal().equals(s))
            {
                this.bb.remove(cla);
                break;
            }
        }
    }

    @Override
    public Set<BoatBoy> getAll() {
        return this.bb;
    }
}
