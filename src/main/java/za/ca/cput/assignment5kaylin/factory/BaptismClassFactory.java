package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.BaptismClass;

public class BaptismClassFactory
{
    public static BaptismClass getBapClass(String classNo, String classTime)
    {
        return new BaptismClass.Builder().classNo(classNo)
                .classTime(classTime)
                .build();
    }
}
