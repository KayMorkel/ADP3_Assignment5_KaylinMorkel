package za.ca.cput.assignment5kaylin.service.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.MarriedGoer;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.Set;

public interface MarriedGoerService extends GenIService<MarriedGoer, String>
{
    Set<MarriedGoer> getAll();
}
