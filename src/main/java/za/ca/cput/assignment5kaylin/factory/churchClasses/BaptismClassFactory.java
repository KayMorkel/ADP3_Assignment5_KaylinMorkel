package za.ca.cput.assignment5kaylin.factory.churchClasses;

import za.ca.cput.assignment5kaylin.domain.churchClasses.BaptismClass;

public class BaptismClassFactory
{
    public static BaptismClass getBapClass(String classNo, String classTime)
    {
        return new BaptismClass.Builder().classNo(classNo)
                .classTime(classTime)
                .build();
    }
}
