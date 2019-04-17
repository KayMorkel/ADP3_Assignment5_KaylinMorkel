package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.IncomingMoney;

public class IncomingMoneyFactory
{
    public static IncomingMoney getIncMon(String id, String from)
    {
        return new IncomingMoney.Builder().id(id)
                .from(from)
                .build();
    }
}
