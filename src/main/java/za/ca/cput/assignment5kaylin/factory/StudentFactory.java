package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.Student;

public class StudentFactory
{
    public static Student getStudent(String studId, String studType)
    {
        return new Student.Builder().studId(studId)
                .studType(studType)
                .build();
    }
}
