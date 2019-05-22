package za.ca.cput.assignment5kaylin.factory.churchClasses;

import za.ca.cput.assignment5kaylin.domain.churchClasses.SundaySchool;

public class SundaySchoolFactory
{
    public static SundaySchool getSunSchool(String classNo)
    {
        return new SundaySchool.Builder().classNo(classNo)
                .build();
    }
}
