package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.Church;

import java.util.Set;

public interface ChurchRepository extends GenIRepository<Church, String>
{
    Set<Church> getAll();
}
