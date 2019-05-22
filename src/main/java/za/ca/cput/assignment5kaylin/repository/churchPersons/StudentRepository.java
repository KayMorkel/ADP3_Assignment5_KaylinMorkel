package za.ca.cput.assignment5kaylin.repository.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.Student;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface StudentRepository extends GenIRepository<Student, String>
{
    Set<Student> getAll();
}
