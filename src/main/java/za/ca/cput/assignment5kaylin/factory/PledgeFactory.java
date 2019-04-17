package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.Pledge;

public class PledgeFactory
{
    public static Pledge getPledge(String pledgeNum, String paymentType)
    {
        return new Pledge.Builder().pledgeNum(pledgeNum)
                .paymentType(paymentType)
                .build();
    }
}
