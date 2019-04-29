package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.LoginStatus;

public class LoginStatusFactory
{
    public static LoginStatus getLoginStat(String statNum, String status)
    {
        return new LoginStatus.Builder().statNum(statNum)
                .status(status)
                .build();
    }
}
