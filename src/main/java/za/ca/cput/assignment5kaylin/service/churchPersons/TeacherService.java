package za.ca.cput.assignment5kaylin.service.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.Teacher;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.Set;

public interface TeacherService extends GenIService<Teacher, String>
{
    Set<Teacher> getAll();
}
