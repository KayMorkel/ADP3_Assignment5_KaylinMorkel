package za.ca.cput.assignment5kaylin.service.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.StandardGoer;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.Set;

public interface StandardGoerService extends GenIService<StandardGoer, String>
{
    Set<StandardGoer> getAll();
}
