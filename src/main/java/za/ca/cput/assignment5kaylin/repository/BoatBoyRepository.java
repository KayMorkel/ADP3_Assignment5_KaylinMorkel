package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.BoatBoy;

import java.util.Set;

public interface BoatBoyRepository extends GenIRepository<BoatBoy, String>
{
    Set<BoatBoy> getAll();
}
