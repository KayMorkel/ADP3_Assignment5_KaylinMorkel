package za.ca.cput.assignment5kaylin.service.churchClasses;

import za.ca.cput.assignment5kaylin.domain.churchClasses.ConfirmationClass;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.Set;

public interface ConfirmationClassService extends GenIService<ConfirmationClass, String>
{
    Set<ConfirmationClass> getAll();
}
