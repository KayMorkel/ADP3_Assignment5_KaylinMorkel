package za.ca.cput.assignment5kaylin.service.churchClasses;

import za.ca.cput.assignment5kaylin.domain.churchClasses.BaptismClass;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.Set;

public interface BaptismClassService extends GenIService<BaptismClass, String>
{
    Set<BaptismClass> getAll();
}
