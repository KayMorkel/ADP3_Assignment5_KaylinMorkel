package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.SidesPerson;
import za.ca.cput.assignment5kaylin.repository.SidesPersonRepository;

import java.util.HashSet;
import java.util.Set;

public class SidesPersonRepositoryImplementation implements SidesPersonRepository
{
    private static SidesPersonRepositoryImplementation classRepository = null;
    private Set<SidesPerson> sideP;

    private SidesPersonRepositoryImplementation()
    {
        this.sideP = new HashSet<>();
    }

    public static SidesPersonRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new SidesPersonRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Set<SidesPerson> getAll() {
        return this.sideP;
    }

    @Override
    public SidesPerson create(SidesPerson sidesPerson) {
        this.sideP.add(sidesPerson);
        return sidesPerson;
    }

    @Override
    public SidesPerson read(String s) {
        SidesPerson got = null;
        for (SidesPerson cla: sideP){
            if (cla.getSal().equals(s)) {
                System.out.println(cla.getSal() + cla.getPayType());
                got = new SidesPerson.Builder().sal(s).payType(cla.getPayType()).build();
            }
        }

        return got;
    }

    @Override
    public SidesPerson update(SidesPerson sidesPerson) {
        if (sideP.contains(sidesPerson))
        {
            sideP.remove(sidesPerson);
            sidesPerson = new SidesPerson.Builder().sal(sidesPerson.getSal()).payType(sidesPerson.getPayType()).build();
            this.sideP.add(sidesPerson);
        }
        //}
        return sidesPerson;
    }

    @Override
    public void delete(String s) {
        for (SidesPerson cla: sideP)
        {
            if (cla.getSal().equals(s))
            {
                this.sideP.remove(cla);
            }
        }
    }
}
