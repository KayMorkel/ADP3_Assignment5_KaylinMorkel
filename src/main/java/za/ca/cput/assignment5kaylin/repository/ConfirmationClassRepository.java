package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.ConfirmationClass;

import java.util.Set;

public interface ConfirmationClassRepository extends GenIRepository<ConfirmationClass, String>
{
    Set<ConfirmationClass> getAll();
}
