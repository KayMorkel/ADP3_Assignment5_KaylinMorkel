package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.LayMinister;

import java.util.Set;

public interface LayMinisterRepository extends GenIRepository<LayMinister, String>
{
    Set<LayMinister> getAll();
}
