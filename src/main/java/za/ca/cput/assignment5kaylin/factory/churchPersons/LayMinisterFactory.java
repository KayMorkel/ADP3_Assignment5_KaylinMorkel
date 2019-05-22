package za.ca.cput.assignment5kaylin.factory.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.LayMinister;

public class LayMinisterFactory
{
    public static LayMinister getLayMinister(String id, String name)
    {
        return new LayMinister.Builder().id(id)
                .name(name)
                .build();
    }
}
