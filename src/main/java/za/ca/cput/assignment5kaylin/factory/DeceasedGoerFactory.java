package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.DeceasedGoer;

public class DeceasedGoerFactory
{
    public static DeceasedGoer getDeceased(String decNum, String yearDied)
    {
        return new DeceasedGoer.Builder().decNum(decNum)
                .yearDied(yearDied)
                .build();
    }
}
