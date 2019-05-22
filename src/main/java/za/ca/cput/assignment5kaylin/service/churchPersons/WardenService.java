package za.ca.cput.assignment5kaylin.service.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.Warden;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.Set;

public interface WardenService extends GenIService<Warden, String>
{
    Set<Warden> getAll();
}
