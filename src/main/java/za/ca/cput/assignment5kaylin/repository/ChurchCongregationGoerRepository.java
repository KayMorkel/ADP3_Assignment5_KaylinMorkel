package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.ChurchCongregationGoer;

import java.util.Set;

public interface ChurchCongregationGoerRepository extends GenIRepository<ChurchCongregationGoer, String>
{
    Set<ChurchCongregationGoer> getAll();
}
