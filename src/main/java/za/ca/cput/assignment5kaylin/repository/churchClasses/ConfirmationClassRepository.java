package za.ca.cput.assignment5kaylin.repository.churchClasses;

import za.ca.cput.assignment5kaylin.domain.churchClasses.ConfirmationClass;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface ConfirmationClassRepository extends GenIRepository<ConfirmationClass, String>
{
    Set<ConfirmationClass> getAll();
}
