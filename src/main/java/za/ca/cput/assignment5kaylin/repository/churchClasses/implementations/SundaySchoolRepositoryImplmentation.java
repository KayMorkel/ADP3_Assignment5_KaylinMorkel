package za.ca.cput.assignment5kaylin.repository.churchClasses.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchClasses.SundaySchool;
import za.ca.cput.assignment5kaylin.factory.churchClasses.SundaySchoolFactory;
import za.ca.cput.assignment5kaylin.repository.churchClasses.SundaySchoolRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class SundaySchoolRepositoryImplmentation implements SundaySchoolRepository
{
    private static SundaySchoolRepositoryImplmentation classRepository = null;
    private Set<SundaySchool> sun;

    private SundaySchoolRepositoryImplmentation()
    {
        this.sun = new HashSet<>();
    }

    public static SundaySchoolRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new SundaySchoolRepositoryImplmentation();
        return classRepository;

    }

    @Override
    public Set<SundaySchool> getAll() {
        return this.sun;
    }

    @Override
    public SundaySchool create(SundaySchool sundaySchool) {
        this.sun.add(sundaySchool);
        return sundaySchool;
    }

    @Override
    public SundaySchool read(String s) {
        SundaySchool got = null;
        for (SundaySchool cla: sun){
            if (cla.getClassNo().equals(s)) {
                System.out.println(cla.getClassNo());
                got = SundaySchoolFactory.getSunSchool(s);
            }
        }

        return got;
    }

    @Override
    public SundaySchool update(SundaySchool sundaySchool) {
        if (sun.contains(sundaySchool))
        {
            sun.remove(sundaySchool);
            sundaySchool = SundaySchoolFactory.getSunSchool(sundaySchool.getClassNo());
            this.sun.add(sundaySchool);
        }
        //}
        return sundaySchool;
    }

    @Override
    public void delete(String s) {
        for (SundaySchool cla: sun)
        {
            if (cla.getClassNo().equals(s))
            {
                this.sun.remove(cla);
            }
        }
    }
}
