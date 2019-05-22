package za.ca.cput.assignment5kaylin.factory.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.UsageOfMoney;

public class UsageOfMoneyFactory
{
    public static UsageOfMoney getUsage(String id, String usedFor)
    {
        return new UsageOfMoney.Builder().id(id)
                .usedFor(usedFor)
                .build();
    }
}
