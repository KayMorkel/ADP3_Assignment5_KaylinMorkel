package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.BoatBoy;

public class BoatBoyFactory
{
    public static BoatBoy getBB(String sal, String payType)
    {
        return new BoatBoy.Builder().sal(sal)
                .payType(payType)
                .build();
    }
}
