package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.Teacher;

import java.util.Set;

public interface TeacherRepository extends GenIRepository<Teacher, String>
{
    Set<Teacher> getAll();
}
