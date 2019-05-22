package za.ca.cput.assignment5kaylin.repository.churchPersons.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Teacher;
import za.ca.cput.assignment5kaylin.factory.churchPersons.TeacherFactory;
import za.ca.cput.assignment5kaylin.repository.churchPersons.TeacherRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class TeacherRepositoryImplementation implements TeacherRepository
{
    private static TeacherRepositoryImplementation classRepository = null;
    private Set<Teacher> teac;

    private TeacherRepositoryImplementation()
    {
        this.teac = new HashSet<>();
    }

    public static TeacherRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new TeacherRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Set<Teacher> getAll() {
        return this.teac;
    }

    @Override
    public Teacher create(Teacher teacher) {
        this.teac.add(teacher);
        return teacher;
    }

    @Override
    public Teacher read(String s) {
        Teacher got = null;
        for (Teacher cla: teac){
            if (cla.getId().equals(s)) {
                System.out.println(cla.getId() + " " + cla.getType());
                got = TeacherFactory.getTeacher(s, cla.getType());
            }
        }
        return got;
    }

    @Override
    public Teacher update(Teacher teacher) {
        if (teac.contains(teacher))
        {
            teac.remove(teacher);
            teacher = TeacherFactory.getTeacher(teacher.getId(), teacher.getType());
            this.teac.add(teacher);
        }
        return teacher;
    }

    @Override
    public void delete(String s) {
        for (Teacher cla: teac)
        {
            if (cla.getId().equals(s))
            {
                this.teac.remove(cla);
            }
        }
    }
}
