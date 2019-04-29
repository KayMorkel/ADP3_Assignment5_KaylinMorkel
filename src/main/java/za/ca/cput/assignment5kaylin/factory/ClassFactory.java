package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.Class;

public class ClassFactory
{
    public static Class getClass(String classId, int numOfStud)
    {
        return new Class.Builder().classId(classId)
                .numOfStudents(numOfStud)
                .build();
    }
}
