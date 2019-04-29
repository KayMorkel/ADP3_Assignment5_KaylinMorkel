package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.Student;
import za.ca.cput.assignment5kaylin.repository.StudentRepository;

import java.util.HashSet;
import java.util.Set;

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
                System.out.println(cla.getStudId() + cla.getStudType());
                got = new Student.Builder().studId(s).studType(cla.getStudType()).build();
            }
        }

        return got;
    }

    @Override
    public Student update(Student student) {
        if (stud.contains(student))
        {
            stud.remove(student);
            student = new Student.Builder().studId(student.getStudId()).studType(student.getStudType()).build();
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
            }
        }
    }
}
