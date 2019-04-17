package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.BaptismClass;
import za.ca.cput.assignment5kaylin.factory.BaptismClassFactory;

public class BaptismClassFactoryTest
{
    @Test
    public void getBapClass() {
        String classNo = "U20";
        String classTime = "19:00";
        BaptismClass bap = BaptismClassFactory.getBapClass(classNo, classTime);
        Assert.assertEquals(classNo, bap.getClassNo());
        System.out.println(bap.getClassNo());
    }
}
