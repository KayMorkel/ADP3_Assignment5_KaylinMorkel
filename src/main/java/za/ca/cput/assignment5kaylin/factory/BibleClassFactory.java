package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.BibleClass;

public class BibleClassFactory
{
    public static BibleClass getBibClass(String classNo, String classTime)
    {
        return new BibleClass.Builder().classNo(classNo)
                .classTime(classTime)
                .build();
    }
}
