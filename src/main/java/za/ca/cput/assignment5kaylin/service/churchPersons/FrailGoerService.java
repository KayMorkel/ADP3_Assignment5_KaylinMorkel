package za.ca.cput.assignment5kaylin.service.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.FrailGoer;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.Set;

public interface FrailGoerService extends GenIService<FrailGoer, String>
{
    Set<FrailGoer> getAll();
}
