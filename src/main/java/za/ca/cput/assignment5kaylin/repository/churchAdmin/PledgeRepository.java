package za.ca.cput.assignment5kaylin.repository.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.Pledge;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface PledgeRepository extends GenIRepository<Pledge, String>
{
    Set<Pledge> getAll();
}
