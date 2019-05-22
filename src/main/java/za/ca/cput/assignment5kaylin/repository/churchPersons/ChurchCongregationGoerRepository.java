package za.ca.cput.assignment5kaylin.repository.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.ChurchCongregationGoer;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface ChurchCongregationGoerRepository extends GenIRepository<ChurchCongregationGoer, String>
{
    Set<ChurchCongregationGoer> getAll();
}
