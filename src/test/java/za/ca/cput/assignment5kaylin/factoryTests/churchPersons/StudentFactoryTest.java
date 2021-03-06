package za.ca.cput.assignment5kaylin.factoryTests.churchPersons;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Student;
import za.ca.cput.assignment5kaylin.factory.churchPersons.StudentFactory;

public class StudentFactoryTest
{
    @Test
    public void getStudent() {
        String studId = "S5265";
        String studType = "Bible class";
        Student stud = StudentFactory.getStudent(studId, studType);
        Assert.assertEquals(studType, stud.getStudType());
        System.out.println(stud.getStudType());
    }
}
