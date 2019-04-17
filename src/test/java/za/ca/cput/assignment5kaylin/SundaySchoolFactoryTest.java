package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.SundaySchool;
import za.ca.cput.assignment5kaylin.factory.SundaySchoolFactory;

public class SundaySchoolFactoryTest
{
    @Test
    public void getSunSchool() {
        String classNo = "M5";
        SundaySchool sun = SundaySchoolFactory.getSunSchool(classNo);
        Assert.assertEquals(classNo, sun.getClassNo());
        System.out.println(sun.getClassNo());
    }
}
