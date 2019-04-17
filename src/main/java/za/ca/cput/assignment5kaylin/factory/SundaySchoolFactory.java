package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.SundaySchool;

public class SundaySchoolFactory
{
    public static SundaySchool getSunSchool(String classNo)
    {
        return new SundaySchool.Builder().classNo(classNo)
                .build();
    }
}
