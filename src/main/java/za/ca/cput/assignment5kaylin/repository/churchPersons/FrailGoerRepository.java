package za.ca.cput.assignment5kaylin.repository.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.FrailGoer;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface FrailGoerRepository extends GenIRepository<FrailGoer, String>
{
    Set<FrailGoer> getAll();
}