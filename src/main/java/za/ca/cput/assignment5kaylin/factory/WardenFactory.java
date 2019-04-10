package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.Warden;

public class WardenFactory
{
    public static Warden getWarden(String wardenName, String wardenTelNumber)
    {
        return new Warden.Builder().wardenName(wardenName)
                .wardenTelNumber(wardenTelNumber)
                .build();
    }
}
