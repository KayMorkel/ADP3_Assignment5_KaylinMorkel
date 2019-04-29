package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.Login;

import java.util.Set;

public interface LoginRepository extends GenIRepository<Login, String>
{
    Set<Login> getAll();
}
