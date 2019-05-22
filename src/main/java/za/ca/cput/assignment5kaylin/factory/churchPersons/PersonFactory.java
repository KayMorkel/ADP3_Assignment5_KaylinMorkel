package za.ca.cput.assignment5kaylin.factory.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.Person;

public class PersonFactory
{
    public static Person getPerson(String name, String telNum)
    {
        return new Person.Builder().pName(name)
                .pTelNumber(telNum)
                .build();
    }
}
