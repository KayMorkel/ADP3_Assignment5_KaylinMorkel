package za.ca.cput.assignment5kaylin.service.churchPersons.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Teacher;
import za.ca.cput.assignment5kaylin.repository.churchPersons.TeacherRepository;
import za.ca.cput.assignment5kaylin.repository.churchPersons.implementations.TeacherRepositoryImplementation;
import za.ca.cput.assignment5kaylin.service.churchPersons.TeacherService;

import java.util.Set;

@Service
public class TeacherServiceImplementation implements TeacherService
{
    @Autowired
    private TeacherRepositoryImplementation repo;

    /*private static TeacherServiceImplementation service = null;
    private TeacherRepository repo;

    private TeacherServiceImplementation()
    {
        this.repo = TeacherRepositoryImplementation.getRepository();
    }

    public static TeacherServiceImplementation getService()
    {
        if(service == null) service = new TeacherServiceImplementation();
        return service;
    }*/

    @Override
    public Set<Teacher> getAll() {
        return this.repo.getAll();
    }

    @Override
    public Teacher create(Teacher teacher) {
        return this.repo.create(teacher);
    }

    @Override
    public Teacher read(String s) {
        return this.repo.read(s);
    }

    @Override
    public Teacher update(Teacher teacher) {
        return this.repo.update(teacher);
    }

    @Override
    public void delete(String s) {
        this.repo.delete(s);
    }
}
