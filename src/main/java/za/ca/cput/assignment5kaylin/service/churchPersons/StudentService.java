package za.ca.cput.assignment5kaylin.service.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.Student;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.Set;

public interface StudentService extends GenIService<Student, String>
{
    Set<Student> getAll();
}
