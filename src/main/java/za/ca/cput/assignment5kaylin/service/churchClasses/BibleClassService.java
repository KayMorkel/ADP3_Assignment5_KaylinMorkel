package za.ca.cput.assignment5kaylin.service.churchClasses;

import za.ca.cput.assignment5kaylin.domain.churchClasses.BibleClass;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.Set;

public interface BibleClassService extends GenIService<BibleClass, String>
{
    Set<BibleClass> getAll();
}
