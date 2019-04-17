package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.ConfirmationClass;
import za.ca.cput.assignment5kaylin.factory.ConfirmationClassFactory;

public class ConfirmationClassFactoryTest
{
    @Test
    public void getBapClass() {
        String classNo = "C20";
        String classTime = "15:00";
        ConfirmationClass conf = ConfirmationClassFactory.getBapClass(classNo, classTime);
        Assert.assertEquals(classNo, conf.getClassNo());
        System.out.println(conf.getClassNo());
    }
}
