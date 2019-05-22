package za.ca.cput.assignment5kaylin.factory.login;

import za.ca.cput.assignment5kaylin.domain.login.LoginStatus;

public class LoginStatusFactory
{
    public static LoginStatus getLoginStat(String statNum, String status)
    {
        return new LoginStatus.Builder().statNum(statNum)
                .status(status)
                .build();
    }
}
