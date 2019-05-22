package za.ca.cput.assignment5kaylin.factory.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.Priest;

public class PriestFactory
{
    public static Priest getPriest(String sal, String inductDate)
    {
        return new Priest.Builder().sal(sal)
                .inductDate(inductDate)
                .build();
    }
}
