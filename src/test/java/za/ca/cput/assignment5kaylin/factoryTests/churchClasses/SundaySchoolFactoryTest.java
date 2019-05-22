package za.ca.cput.assignment5kaylin.factoryTests.churchClasses;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.churchClasses.SundaySchool;
import za.ca.cput.assignment5kaylin.factory.churchClasses.SundaySchoolFactory;

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
