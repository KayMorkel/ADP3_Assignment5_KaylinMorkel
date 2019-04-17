package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.Priest;

public class PriestFactory
{
    public static Priest getPriest(String sal, String inductDate)
    {
        return new Priest.Builder().sal(sal)
                .inductDate(inductDate)
                .build();
    }
}
