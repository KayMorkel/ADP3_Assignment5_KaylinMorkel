package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.Class;

import java.util.Set;

public interface ClassRepository extends GenIRepository<Class, String>
{
    Set<Class> getAll();
}
