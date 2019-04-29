package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.Class;
import za.ca.cput.assignment5kaylin.repository.ClassRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ClassRepositoryImplementation implements ClassRepository
{
    private static ClassRepositoryImplementation classRepository = null;
    private Set<Class> classes;

    private ClassRepositoryImplementation()
    {
        this.classes = new HashSet<>();
    }

    public static ClassRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new ClassRepositoryImplementation();
            return classRepository;

    }

    @Override
    public Class create(Class aClass)
    {
        this.classes.add(aClass);
        return aClass;
    }

    @Override
    public Class read(String classId)
    {
        /*Class got = null;
        Iterator<Class> it = classes.iterator();
        while (it.hasNext()) {
            if (it.next().getClassId().equals(classId)) {
                //System.out.println(cla.getClassId() + cla.getNumOfStudents());
                got = new Class.Builder().classId(classId).numOfStudents(it.next().getNumOfStudents()).build();
            }
            System.out.println(it.next());
        }*/
        //Class cla = null;
        Class got = null;
        for (Class cla: classes){
            if (cla.getClassId().equals(classId)) {
                System.out.println(cla.getClassId() + cla.getNumOfStudents());
                got = new Class.Builder().classId(classId).numOfStudents(cla.getNumOfStudents()).build();
            }
        }

        return got;

    }

    @Override
    public Class update(Class aClass)
    {
        //for (Class cla: classes){
            if (classes.contains(aClass))
            {
                classes.remove(aClass);
                aClass = new Class.Builder().classId(aClass.getClassId()).numOfStudents(aClass.getNumOfStudents()).build();
                this.classes.add(aClass);
            }
        //}
        return aClass;
    }

    @Override
    public void delete(String s)
    {
        /*if(classes.contains(s))
        {
            classes.remove(getClass());
        };*/
        for (Class cla: classes)
        {
            if (cla.getClassId().equals(s))
            {
                this.classes.remove(cla);
            }
        }
    }

    @Override
    public Set<Class> getAll()
    {
        return this.classes;
    }
}
