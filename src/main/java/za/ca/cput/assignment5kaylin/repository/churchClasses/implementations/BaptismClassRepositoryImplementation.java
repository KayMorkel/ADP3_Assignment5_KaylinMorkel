package za.ca.cput.assignment5kaylin.repository.churchClasses.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchClasses.BaptismClass;
import za.ca.cput.assignment5kaylin.factory.churchClasses.BaptismClassFactory;
import za.ca.cput.assignment5kaylin.repository.churchClasses.BaptismClassRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class BaptismClassRepositoryImplementation implements BaptismClassRepository {

    private static BaptismClassRepositoryImplementation classRepository = null;
    private Set<BaptismClass> bapClass;

    private BaptismClassRepositoryImplementation()
    {
        this.bapClass = new HashSet<>();
    }

    public static BaptismClassRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new BaptismClassRepositoryImplementation();
        return classRepository;

    }

    @Override
    public BaptismClass create(BaptismClass baptismClass)
    {
        this.bapClass.add(baptismClass);
        return baptismClass;
    }

    @Override
    public BaptismClass read(String s)
    {
        BaptismClass got = null;
        for (BaptismClass cla: bapClass){
            if (cla.getClassNo().equals(s)) {
                System.out.println(cla.getClassNo() + " " + cla.getClassTime());
                got = BaptismClassFactory.getBapClass(s, cla.getClassTime());
            }
        }

        return got;
    }

    @Override
    public BaptismClass update(BaptismClass baptismClass)
    {
        if (bapClass.contains(baptismClass))
        {
            bapClass.remove(baptismClass);
            baptismClass = BaptismClassFactory.getBapClass(baptismClass.getClassNo(), baptismClass.getClassTime());
            this.bapClass.add(baptismClass);
        }

        return baptismClass;
    }

    @Override
    public void delete(String s)
    {
        for (BaptismClass cla: bapClass)
        {
            if (cla.getClassNo().equals(s))
            {
                this.bapClass.remove(cla);
                break;
            }
        }
    }
    @Override
    public Set<BaptismClass> getAll()
    {
        return this.bapClass;
    }
}
