package za.ca.cput.assignment5kaylin.repository.churchPersons.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchPersons.SidesPerson;
import za.ca.cput.assignment5kaylin.factory.churchPersons.SidesPersonFactory;
import za.ca.cput.assignment5kaylin.repository.churchPersons.SidesPersonRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
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
                System.out.println(cla.getSal() + " " + cla.getPayType());
                got = SidesPersonFactory.getSideP(s, cla.getPayType());
            }
        }
        return got;
    }

    @Override
    public SidesPerson update(SidesPerson sidesPerson) {
        if (sideP.contains(sidesPerson))
        {
            sideP.remove(sidesPerson);
            sidesPerson = SidesPersonFactory.getSideP(sidesPerson.getSal(), sidesPerson.getPayType());
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
