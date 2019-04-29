package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.BibleClass;
import za.ca.cput.assignment5kaylin.repository.BibleClassRepository;

import java.util.HashSet;
import java.util.Set;

public class BibleClassRepositoryImplementation implements BibleClassRepository
{
    private static BibleClassRepositoryImplementation classRepository = null;
    private Set<BibleClass> bibClass;

    private BibleClassRepositoryImplementation()
    {
        this.bibClass = new HashSet<>();
    }

    public static BibleClassRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new BibleClassRepositoryImplementation();
        return classRepository;

    }

    @Override
    public BibleClass create(BibleClass bibleClass)
    {
        this.bibClass.add(bibleClass);
        return bibleClass;
    }

    @Override
    public BibleClass read(String s)
    {
        BibleClass got = null;
        for (BibleClass cla: bibClass){
            if (cla.getClassNo().equals(s)) {
                System.out.println(cla.getClassNo() + cla.getClassTime());
                got = new BibleClass.Builder().classNo(s).classTime(cla.getClassTime()).build();
            }
        }

        return got;
    }

    @Override
    public BibleClass update(BibleClass bibleClass) {
        //for (Class cla: classes){
        if (bibClass.contains(bibleClass))
        {
            bibClass.remove(bibleClass);
            bibleClass = new BibleClass.Builder().classNo(bibleClass.getClassNo()).classTime(bibleClass.getClassTime()).build();
            this.bibClass.add(bibleClass);
        }
        //}
        return bibleClass;
    }

    @Override
    public void delete(String s)
    {
        for (BibleClass cla: bibClass)
        {
            if (cla.getClassNo().equals(s))
            {
                this.bibClass.remove(cla);
            }
        }
    }

    @Override
    public Set<BibleClass> getAll() {
        return this.bibClass;
    }
}
