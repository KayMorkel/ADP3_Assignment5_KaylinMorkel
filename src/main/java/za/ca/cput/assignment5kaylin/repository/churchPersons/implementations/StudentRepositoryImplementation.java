/*package za.ca.cput.assignment5kaylin.repository.churchPersons.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Student;
import za.ca.cput.assignment5kaylin.factory.churchPersons.StudentFactory;
import za.ca.cput.assignment5kaylin.repository.churchPersons.StudentRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class StudentRepositoryImplementation implements StudentRepository
{
    private static StudentRepositoryImplementation classRepository = null;
    private Set<Student> stud;

    private StudentRepositoryImplementation()
    {
        this.stud = new HashSet<>();
    }

    public static StudentRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new StudentRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Set<Student> getAll() {
        return this.stud;
    }

    @Override
    public Student create(Student student) {
        this.stud.add(student);
        return student;
    }

    @Override
    public Student read(String s) {
        Student got = null;
        for (Student cla: stud){
            if (cla.getStudId().equals(s)) {
                System.out.println(cla.getStudId() + " " +  cla.getStudType());
                got = StudentFactory.getStudent(s, cla.getStudType());
            }
        }
        return got;
    }

    @Override
    public Student update(Student student) {
        if (stud.contains(student))
        {
            stud.remove(student);
            student = StudentFactory.getStudent(student.getStudId(), student.getStudType());
            this.stud.add(student);
        }
        //}
        return student;
    }

    @Override
    public void delete(String s) {
        for (Student cla: stud)
        {
            if (cla.getStudId().equals(s))
            {
                this.stud.remove(cla);
                break;
            }
        }
    }
}*/
