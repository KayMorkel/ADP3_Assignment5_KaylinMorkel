package za.ca.cput.assignment5kaylin.factory.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.StandardGoer;

public class StandardGoerFactory
{
    public static StandardGoer getIsPledger(String pledger)
    {
        return new StandardGoer.Builder().pledger(pledger)
                .build();
    }
}
