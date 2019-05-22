package za.ca.cput.assignment5kaylin.repository.churchClasses;

import za.ca.cput.assignment5kaylin.domain.churchClasses.BibleClass;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface BibleClassRepository extends GenIRepository<BibleClass, String>
{
    Set<BibleClass> getAll();
}
