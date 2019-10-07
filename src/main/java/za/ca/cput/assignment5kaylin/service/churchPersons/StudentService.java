package za.ca.cput.assignment5kaylin.service.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.Student;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.List;
import java.util.Set;

public interface StudentService extends GenIService<Student, String>
{
    Student retrieveById(String id);
    List<Student> getAll();
}
