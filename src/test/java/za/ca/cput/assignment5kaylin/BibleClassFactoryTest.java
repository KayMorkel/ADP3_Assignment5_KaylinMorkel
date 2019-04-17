package za.ca.cput.assignment5kaylin;

import org.junit.Assert;
import org.junit.Test;
import za.ca.cput.assignment5kaylin.domain.BibleClass;
import za.ca.cput.assignment5kaylin.factory.BibleClassFactory;

public class BibleClassFactoryTest
{
    @Test
    public void getBibClass() {
        String classNo = "Bib20";
        String classTime = "15:00";
        BibleClass bib = BibleClassFactory.getBibClass(classNo, classTime);
        Assert.assertEquals(classNo, bib.getClassNo());
        System.out.println(bib.getClassNo());
    }
}
