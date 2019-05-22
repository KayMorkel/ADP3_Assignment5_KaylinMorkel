package za.ca.cput.assignment5kaylin.repository.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.StandardGoer;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface StandardGoerRepository extends GenIRepository<StandardGoer, String>
{
    Set<StandardGoer> getAll();
}
