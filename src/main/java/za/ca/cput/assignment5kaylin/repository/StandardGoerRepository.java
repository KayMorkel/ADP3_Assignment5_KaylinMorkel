package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.StandardGoer;

import java.util.Set;

public interface StandardGoerRepository extends GenIRepository<StandardGoer, String>
{
    Set<StandardGoer> getAll();
}
