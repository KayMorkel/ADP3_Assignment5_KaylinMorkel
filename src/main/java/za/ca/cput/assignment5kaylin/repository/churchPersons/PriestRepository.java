package za.ca.cput.assignment5kaylin.repository.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.Priest;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface PriestRepository extends GenIRepository<Priest, String>
{
    Set<Priest> getAll();
}
