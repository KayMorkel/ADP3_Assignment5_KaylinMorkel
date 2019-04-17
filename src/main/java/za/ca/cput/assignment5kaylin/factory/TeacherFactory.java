package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.Teacher;

public class TeacherFactory
{
    public static Teacher getTeacher(String id, String type)
    {
        return new Teacher.Builder().id(id)
                .type(type)
                .build();
    }
}
