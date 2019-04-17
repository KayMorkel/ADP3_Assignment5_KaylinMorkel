package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.FrailGoer;

public class FrailGoerFactory
{
    public static FrailGoer getFrailP(String frailNum, String type)
    {
        return new FrailGoer.Builder().frailNum(frailNum)
                .type(type)
                .build();
    }
}
