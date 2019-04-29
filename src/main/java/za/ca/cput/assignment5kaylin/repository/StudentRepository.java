package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.Student;

import java.util.Set;

public interface StudentRepository extends GenIRepository<Student, String>
{
    Set<Student> getAll();
}
