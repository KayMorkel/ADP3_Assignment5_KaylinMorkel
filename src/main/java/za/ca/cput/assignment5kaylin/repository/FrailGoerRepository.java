package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.FrailGoer;

import java.util.Set;

public interface FrailGoerRepository extends GenIRepository<FrailGoer, String>
{
    Set<FrailGoer> getAll();
}