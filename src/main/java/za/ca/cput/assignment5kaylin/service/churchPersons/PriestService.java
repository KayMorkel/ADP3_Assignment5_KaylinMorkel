package za.ca.cput.assignment5kaylin.service.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.Priest;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.Set;

public interface PriestService extends GenIService<Priest, String>
{
    Set<Priest> getAll();
}
