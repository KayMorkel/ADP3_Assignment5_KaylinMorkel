package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.Priest;

import java.util.Set;

public interface PriestRepository extends GenIRepository<Priest, String>
{
    Set<Priest> getAll();
}
