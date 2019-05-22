package za.ca.cput.assignment5kaylin.repository.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.YearEvent;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface YearEventRepository extends GenIRepository<YearEvent, String>
{
    Set<YearEvent> getAll();
}
