package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.UsageOfMoney;

public class UsageOfMoneyFactory
{
    public static UsageOfMoney getUsage(String id, String usedFor)
    {
        return new UsageOfMoney.Builder().id(id)
                .usedFor(usedFor)
                .build();
    }
}
