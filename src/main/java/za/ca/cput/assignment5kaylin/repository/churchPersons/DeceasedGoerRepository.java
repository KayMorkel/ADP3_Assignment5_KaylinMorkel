package za.ca.cput.assignment5kaylin.repository.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.DeceasedGoer;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface DeceasedGoerRepository extends GenIRepository<DeceasedGoer, String>
{
    Set<DeceasedGoer> getAll();
}
