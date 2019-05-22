package za.ca.cput.assignment5kaylin.repository.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.Teacher;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface TeacherRepository extends GenIRepository<Teacher, String>
{
    Set<Teacher> getAll();
}
