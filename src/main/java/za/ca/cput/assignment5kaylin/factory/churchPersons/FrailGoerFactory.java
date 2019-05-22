package za.ca.cput.assignment5kaylin.factory.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.FrailGoer;

public class FrailGoerFactory
{
    public static FrailGoer getFrailP(String frailNum, String type)
    {
        return new FrailGoer.Builder().frailNum(frailNum)
                .type(type)
                .build();
    }
}
