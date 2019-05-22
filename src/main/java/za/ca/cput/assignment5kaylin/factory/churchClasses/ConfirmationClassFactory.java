package za.ca.cput.assignment5kaylin.factory.churchClasses;

import za.ca.cput.assignment5kaylin.domain.churchClasses.ConfirmationClass;

public class ConfirmationClassFactory
{
    public static ConfirmationClass getBapClass(String classNo, String classTime)
    {
        return new ConfirmationClass.Builder().classNo(classNo)
                .classTime(classTime)
                .build();
    }
}
