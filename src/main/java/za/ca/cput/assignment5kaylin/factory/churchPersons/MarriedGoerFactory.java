package za.ca.cput.assignment5kaylin.factory.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.MarriedGoer;

public class MarriedGoerFactory
{
    public static MarriedGoer getMarried(String id, String yearMarried)
    {
        return new MarriedGoer.Builder().id(id)
                .yearMarried(yearMarried)
                .build();
    }
}
