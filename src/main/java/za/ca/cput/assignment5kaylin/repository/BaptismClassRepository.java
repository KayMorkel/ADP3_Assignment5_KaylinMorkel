package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.BaptismClass;

import java.util.Set;

public interface BaptismClassRepository extends GenIRepository<BaptismClass, String>
{
    Set<BaptismClass> getAll();
}
