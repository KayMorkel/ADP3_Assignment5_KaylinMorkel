package za.ca.cput.assignment5kaylin.factoryTests.churchPersons;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.churchPersons.Person;
import za.ca.cput.assignment5kaylin.factory.churchPersons.PersonFactory;

public class PersonFactoryTest
{
    @Test
    public void getPerson() {
        String name = "P15989";
        String telNum = "0834527896";
        Person p = PersonFactory.getPerson(name, telNum);
        Assert.assertEquals(name, p.getpName());
        System.out.println(p.getpName());
    }
}
