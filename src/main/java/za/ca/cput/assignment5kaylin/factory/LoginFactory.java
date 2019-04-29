package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.Login;

public class LoginFactory
{
    public static Login getLogin(String username, String password)
    {
        return new Login.Builder().username(username)
                .password(password)
                .build();
    }
}
