package za.ca.cput.assignment5kaylin.repository.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.MarriedGoer;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface MarriedGoerRepository extends GenIRepository<MarriedGoer, String>
{
    Set<MarriedGoer> getAll();
}
