package za.ca.cput.assignment5kaylin.repository.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.Church;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface ChurchRepository extends GenIRepository<Church, String>
{
    Set<Church> getAll();
}
