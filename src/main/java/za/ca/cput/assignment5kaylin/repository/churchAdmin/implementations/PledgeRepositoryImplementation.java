package za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Pledge;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.PledgeFactory;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.PledgeRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class PledgeRepositoryImplementation implements PledgeRepository
{
    private static PledgeRepositoryImplementation classRepository = null;
    private Set<Pledge> ple;

    private PledgeRepositoryImplementation()
    {
        this.ple = new HashSet<>();
    }

    public static PledgeRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new PledgeRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Set<Pledge> getAll() {
        return this.ple;
    }

    @Override
    public Pledge create(Pledge pledge) {
        this.ple.add(pledge);
        return pledge;
    }

    @Override
    public Pledge read(String s) {
        Pledge got = null;
        for (Pledge cla: ple){
            if (cla.getPledgeNum().equals(s)) {
                System.out.println(cla.getPledgeNum() + " "+ cla.getPaymentType());
                got = PledgeFactory.getPledge(s, cla.getPaymentType());
            }
        }

        return got;
    }

    @Override
    public Pledge update(Pledge pledge) {
        if (ple.contains(pledge))
        {
            ple.remove(pledge);
            pledge = PledgeFactory.getPledge(pledge.getPledgeNum(), pledge.getPaymentType());
            this.ple.add(pledge);
        }
        //}
        return pledge;
    }

    @Override
    public void delete(String s) {
        for (Pledge cla: ple)
        {
            if (cla.getPledgeNum().equals(s))
            {
                this.ple.remove(cla);
                break;
            }
        }
    }
}
