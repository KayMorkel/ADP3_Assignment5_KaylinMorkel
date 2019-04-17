package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.Person;

public class PersonFactory
{
    public static Person getPerson(String name, String telNum)
    {
        return new Person.Builder().pName(name)
                .pTelNumber(telNum)
                .build();
    }
}
