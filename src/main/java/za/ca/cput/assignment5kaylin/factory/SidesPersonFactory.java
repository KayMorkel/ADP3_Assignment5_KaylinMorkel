package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.SidesPerson;

public class SidesPersonFactory
{
    public static SidesPerson getSideP(String sal, String payType)
    {
        return new SidesPerson.Builder().sal(sal)
                .payType(payType)
                .build();
    }
}
