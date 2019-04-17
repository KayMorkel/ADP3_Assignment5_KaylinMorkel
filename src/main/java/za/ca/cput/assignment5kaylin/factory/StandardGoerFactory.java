package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.StandardGoer;

public class StandardGoerFactory
{
    public static StandardGoer getIsPledger(boolean pledger)
    {
        return new StandardGoer.Builder().pledger(pledger)
                .build();
    }
}
