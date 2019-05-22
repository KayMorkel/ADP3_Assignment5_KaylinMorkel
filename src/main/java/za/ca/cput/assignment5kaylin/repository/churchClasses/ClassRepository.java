package za.ca.cput.assignment5kaylin.repository.churchClasses;

import za.ca.cput.assignment5kaylin.domain.churchClasses.Class;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface ClassRepository extends GenIRepository<Class, String>
{
    Set<Class> getAll();
}
