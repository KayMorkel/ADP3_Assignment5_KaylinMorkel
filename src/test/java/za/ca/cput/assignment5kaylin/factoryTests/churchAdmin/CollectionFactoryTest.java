package za.ca.cput.assignment5kaylin.factoryTests.churchAdmin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Collection;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.CollectionFactory;

public class CollectionFactoryTest
{
    @Test
    public void getCollection() {
        String id = "Col200";
        double amt = 1600.00;
        Collection coll = CollectionFactory.getCollection(id, amt);
        Assert.assertEquals(id, coll.getCollectId());
        System.out.println(coll.getCollectId());
    }

}
