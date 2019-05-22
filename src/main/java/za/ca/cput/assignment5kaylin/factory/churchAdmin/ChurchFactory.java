package za.ca.cput.assignment5kaylin.factory.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.Church;

public class ChurchFactory
{
    public static Church getChurch(String churchId, String address)
    {
        return new Church.Builder().churchId(churchId)
                .address(address)
                .build();
}
}

