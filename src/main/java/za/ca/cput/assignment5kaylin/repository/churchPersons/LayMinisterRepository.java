package za.ca.cput.assignment5kaylin.repository.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.LayMinister;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface LayMinisterRepository extends GenIRepository<LayMinister, String>
{
    Set<LayMinister> getAll();
}
