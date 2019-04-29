package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.DeceasedGoer;

import java.util.Set;

public interface DeceasedGoerRepository extends GenIRepository<DeceasedGoer, String>
{
    Set<DeceasedGoer> getAll();
}
