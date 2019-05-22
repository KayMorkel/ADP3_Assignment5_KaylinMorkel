package za.ca.cput.assignment5kaylin.factory.churchClasses;

import za.ca.cput.assignment5kaylin.domain.churchClasses.BibleClass;

public class BibleClassFactory
{
    public static BibleClass getBibClass(String classNo, String classTime)
    {
        return new BibleClass.Builder().classNo(classNo)
                .classTime(classTime)
                .build();
    }
}
