package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.Teacher;
import za.ca.cput.assignment5kaylin.factory.TeacherFactory;

public class TeacherFactoryTest
{
    @Test
    public void getTeacher() {
        String id = "T2583";
        String type = "Sunday School";
        Teacher tea = TeacherFactory.getTeacher(id, type);
        Assert.assertEquals(id, tea.getId());
        System.out.println(tea.getId());
    }
}
