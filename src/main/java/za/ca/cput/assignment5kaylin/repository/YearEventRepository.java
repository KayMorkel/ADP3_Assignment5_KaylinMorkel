package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.YearEvent;

import java.util.Set;

public interface YearEventRepository extends GenIRepository<YearEvent, String>
{
    Set<YearEvent> getAll();
}
