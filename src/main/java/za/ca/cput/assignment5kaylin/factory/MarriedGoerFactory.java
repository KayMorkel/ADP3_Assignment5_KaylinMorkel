package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.MarriedGoer;

public class MarriedGoerFactory
{
    public static MarriedGoer getMarried(String id, String yearMarried)
    {
        return new MarriedGoer.Builder().id(id)
                .yearMarried(yearMarried)
                .build();
    }
}
