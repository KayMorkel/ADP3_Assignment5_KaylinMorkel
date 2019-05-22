package za.ca.cput.assignment5kaylin.repository.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.BoatBoy;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface BoatBoyRepository extends GenIRepository<BoatBoy, String>
{
    Set<BoatBoy> getAll();
}
