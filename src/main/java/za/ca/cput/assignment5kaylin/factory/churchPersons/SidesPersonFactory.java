package za.ca.cput.assignment5kaylin.factory.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.SidesPerson;

public class SidesPersonFactory
{
    public static SidesPerson getSideP(String sal, String payType)
    {
        return new SidesPerson.Builder().sal(sal)
                .payType(payType)
                .build();
    }
}
