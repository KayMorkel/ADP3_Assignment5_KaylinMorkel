package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.Warden;

import java.util.Set;

public interface WardenRepository extends GenIRepository<Warden, String>
{
    Set<Warden> getAll();
}
