package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Teacher;
import za.ca.cput.assignment5kaylin.repository.churchPersons.TeacherRepository;
//import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.TeacherRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.TeacherService;

import java.util.List;
import java.util.Set;

@Service
public class TeacherServiceImplementation implements TeacherService
{
    @Autowired
    private TeacherRepository repo;

    private static TeacherServiceImplementation service = null;
    //private TeacherRepository repo;

    private TeacherServiceImplementation()
    {
      //  this.repo = TeacherRepositoryImplementation.getRepository();
    }

    public static TeacherServiceImplementation getService()
    {
        if(service == null) service = new TeacherServiceImplementation();
        return service;
    }

    @Override
    public Teacher retrieveById(String id) {
        List<Teacher> churches = getAll();
        for(Teacher c: churches)
        {
            if (c.getId().equals(id)) return c;
        }
        return null;
    }

    @Override
    public List<Teacher> getAll() {
        return this.repo.findAll();
    }

    @Override
    public Teacher create(Teacher teacher) {
        return this.repo.save(teacher);
    }

    @Override
    public Teacher read(String s) {
        return this.repo.findById(s).orElse(null);
    }

    @Override
    public Teacher update(Teacher teacher) {
        return this.repo.save(teacher);
    }

    @Override
    public void delete(String s) {
        this.repo.deleteById(s);
    }
}
