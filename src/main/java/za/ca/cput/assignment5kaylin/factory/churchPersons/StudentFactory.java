package za.ca.cput.assignment5kaylin.factory.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.Student;

public class StudentFactory
{
    public static Student getStudent(String studId, String studType)
    {
        return new Student.Builder().studId(studId)
                .studType(studType)
                .build();
    }
}
