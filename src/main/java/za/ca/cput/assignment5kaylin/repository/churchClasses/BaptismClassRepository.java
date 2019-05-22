package za.ca.cput.assignment5kaylin.repository.churchClasses;

import za.ca.cput.assignment5kaylin.domain.churchClasses.BaptismClass;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface BaptismClassRepository extends GenIRepository<BaptismClass, String>
{
    Set<BaptismClass> getAll();
}
