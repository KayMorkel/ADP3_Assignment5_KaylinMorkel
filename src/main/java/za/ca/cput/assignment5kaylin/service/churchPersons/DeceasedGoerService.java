package za.ca.cput.assignment5kaylin.service.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.DeceasedGoer;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.List;
import java.util.Set;

public interface DeceasedGoerService extends GenIService<DeceasedGoer, String>
{
    DeceasedGoer retrieveById(String id);
    List<DeceasedGoer> getAll();
}
