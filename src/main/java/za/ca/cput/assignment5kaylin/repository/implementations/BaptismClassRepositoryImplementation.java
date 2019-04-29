package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.BaptismClass;
import za.ca.cput.assignment5kaylin.repository.BaptismClassRepository;

import java.util.HashSet;
import java.util.Set;

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
                System.out.println(cla.getClassNo() + cla.getClassTime());
                got = new BaptismClass.Builder().classNo(s).classTime(cla.getClassTime()).build();
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
            baptismClass = new BaptismClass.Builder().classNo(baptismClass.getClassNo()).classTime(baptismClass.getClassTime()).build();
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
            }
        }
    }
    @Override
    public Set<BaptismClass> getAll()
    {
        return this.bapClass;
    }
}
