package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.Warden;
import za.ca.cput.assignment5kaylin.repository.WardenRepository;

import java.util.HashSet;
import java.util.Set;

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
                System.out.println(cla.getWardenName() + cla.getWardenTelNumber());
                got = new Warden.Builder().wardenName(s).wardenTelNumber(cla.getWardenTelNumber()).build();
            }
        }

        return got;
    }

    @Override
    public Warden update(Warden warden) {
        if (ward.contains(warden))
        {
            ward.remove(warden);
            warden = new Warden.Builder().wardenName(warden.getWardenName()).wardenTelNumber(warden.getWardenTelNumber()).build();
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
            }
        }
    }
}
