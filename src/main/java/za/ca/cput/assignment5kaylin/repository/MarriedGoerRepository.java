package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.MarriedGoer;

import java.util.Set;

public interface MarriedGoerRepository extends GenIRepository<MarriedGoer, String>
{
    Set<MarriedGoer> getAll();
}
