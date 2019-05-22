package za.ca.cput.assignment5kaylin.repository.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.Warden;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface WardenRepository extends GenIRepository<Warden, String>
{
    Set<Warden> getAll();
}
