package za.ca.cput.assignment5kaylin.factoryTests.churchClasses;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.churchClasses.Class;
import za.ca.cput.assignment5kaylin.factory.churchClasses.ClassFactory;

public class ClassFactoryTest
{
    @Test
    public void getCClass() {
        String id = "BibC1005";
        int numStud = 10;
        Class cl = ClassFactory.getClass(id, numStud);
        Assert.assertEquals(id, cl.getClassId());
        System.out.println(cl.getClassId());
    }
}
