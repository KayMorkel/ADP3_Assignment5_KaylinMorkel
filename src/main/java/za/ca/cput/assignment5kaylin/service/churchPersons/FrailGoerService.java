package za.ca.cput.assignment5kaylin.service.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.FrailGoer;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.List;
import java.util.Set;

public interface FrailGoerService extends GenIService<FrailGoer, String>
{
    FrailGoer retrieveById(String id);
    List<FrailGoer> getAll();
}
