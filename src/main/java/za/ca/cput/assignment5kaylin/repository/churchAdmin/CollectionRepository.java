package za.ca.cput.assignment5kaylin.repository.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.Collection;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface CollectionRepository extends GenIRepository<Collection, String>
{
    Set<Collection> getAll();
}
