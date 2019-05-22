package za.ca.cput.assignment5kaylin.factory.churchClasses;

import za.ca.cput.assignment5kaylin.domain.churchClasses.Class;

public class ClassFactory
{
    public static Class getClass(String classId, int numOfStud)
    {
        return new Class.Builder().classId(classId)
                .numOfStudents(numOfStud)
                .build();
    }
}
