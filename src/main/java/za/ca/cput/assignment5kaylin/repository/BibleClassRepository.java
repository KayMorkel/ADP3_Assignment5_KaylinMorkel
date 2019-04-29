package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.BibleClass;

import java.util.Set;

public interface BibleClassRepository extends GenIRepository<BibleClass, String>
{
    Set<BibleClass> getAll();
}
