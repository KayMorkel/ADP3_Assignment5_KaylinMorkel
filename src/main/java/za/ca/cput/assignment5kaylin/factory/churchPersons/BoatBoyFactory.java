package za.ca.cput.assignment5kaylin.factory.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.BoatBoy;

public class BoatBoyFactory
{
    public static BoatBoy getBB(String sal, String payType)
    {
        return new BoatBoy.Builder().sal(sal)
                .payType(payType)
                .build();
    }
}
