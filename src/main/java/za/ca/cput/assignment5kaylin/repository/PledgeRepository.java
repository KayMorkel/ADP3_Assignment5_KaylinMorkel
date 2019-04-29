package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.Pledge;

import java.util.Set;

public interface PledgeRepository extends GenIRepository<Pledge, String>
{
    Set<Pledge> getAll();
}
