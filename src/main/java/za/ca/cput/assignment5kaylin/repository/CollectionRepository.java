package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.Collection;

import java.util.Set;

public interface CollectionRepository extends GenIRepository<Collection, String>
{
    Set<Collection> getAll();
}
