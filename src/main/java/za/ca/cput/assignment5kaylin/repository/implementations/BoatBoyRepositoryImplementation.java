package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.BoatBoy;
import za.ca.cput.assignment5kaylin.repository.BoatBoyRepository;

import java.util.HashSet;
import java.util.Set;

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
                System.out.println(cla.getSal() + cla.getPayType());
                got = new BoatBoy.Builder().sal(s).payType(cla.getPayType()).build();
            }
        }

        return got;
    }

    @Override
    public BoatBoy update(BoatBoy boatBoy) {
        //for (Class cla: classes){
        if (bb.contains(boatBoy))
        {
            bb.remove(boatBoy);
            boatBoy = new BoatBoy.Builder().sal(boatBoy.getSal()).payType(boatBoy.getPayType()).build();
            this.bb.add(boatBoy);
        }
        //}
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
            }
        }
    }

    @Override
    public Set<BoatBoy> getAll() {
        return this.bb;
    }
}
