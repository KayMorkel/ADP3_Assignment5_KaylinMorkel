package za.ca.cput.assignment5kaylin.repository.churchPersons.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Warden;
import za.ca.cput.assignment5kaylin.factory.churchPersons.WardenFactory;
import za.ca.cput.assignment5kaylin.repository.churchPersons.WardenRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class WardenRepositoryImplementation implements WardenRepository
{
    private static WardenRepositoryImplementation classRepository = null;
    private Set<Warden> ward;

    private WardenRepositoryImplementation()
    {
        this.ward = new HashSet<>();
    }

    public static WardenRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new WardenRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Set<Warden> getAll() {
        return this.ward;
    }

    @Override
    public Warden create(Warden warden) {
        this.ward.add(warden);
        return warden;
    }

    @Override
    public Warden read(String s) {
        Warden got = null;
        for (Warden cla: ward){
            if (cla.getWardenName().equals(s)) {
                System.out.println(cla.getWardenName() + " " + cla.getWardenTelNumber());
                got = WardenFactory.getWarden(s, cla.getWardenTelNumber());
            }
        }
        return got;
    }

    @Override
    public Warden update(Warden warden) {
        if (ward.contains(warden))
        {
            ward.remove(warden);
            warden = WardenFactory.getWarden(warden.getWardenName(), warden.getWardenTelNumber());
            this.ward.add(warden);
        }
        //}
        return warden;
    }

    @Override
    public void delete(String s) {
        for (Warden cla: ward)
        {
            if (cla.getWardenName().equals(s))
            {
                this.ward.remove(cla);
                break;
            }
        }
    }
}
