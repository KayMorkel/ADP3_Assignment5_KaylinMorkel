/*package za.ca.cput.assignment5kaylin.repository.churchClasses.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchClasses.BibleClass;
import za.ca.cput.assignment5kaylin.factory.churchClasses.BibleClassFactory;
import za.ca.cput.assignment5kaylin.repository.churchClasses.BibleClassRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
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
                System.out.println(cla.getClassNo() + " " + cla.getClassTime());
                got = BibleClassFactory.getBibClass(s, cla.getClassTime());
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
            bibleClass = BibleClassFactory.getBibClass(bibleClass.getClassNo(), bibleClass.getClassTime());
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
                break;
            }
        }
    }

    @Override
    public Set<BibleClass> getAll() {
        return this.bibClass;
    }
}*/
