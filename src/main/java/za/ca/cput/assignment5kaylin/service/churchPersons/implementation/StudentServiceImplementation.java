package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Student;
import za.ca.cput.assignment5kaylin.repository.churchPersons.StudentRepository;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.StudentRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.StudentService;

import java.util.List;
import java.util.Set;

@Service
public class StudentServiceImplementation implements StudentService
{
    @Autowired
    private StudentRepository repo;

    private static StudentServiceImplementation service = null;
    //private StudentRepository repo;

    private StudentServiceImplementation()
    {
      //  this.repo = StudentRepositoryImplementation.getRepository();
    }

    public static StudentServiceImplementation getService()
    {
        if(service == null) service = new StudentServiceImplementation();
        return service;
    }

    @Override
    public Student retrieveById(String id) {
        List<Student> churches = getAll();
        for(Student c: churches)
        {
            if (c.getStudId().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<Student> getAll() {
        return this.repo.findAll();
    }

    @Override
    public Student create(Student student) {
        return this.repo.save(student);
    }

    @Override
    public Student read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public Student update(Student student) {
        return this.repo.save(student);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
