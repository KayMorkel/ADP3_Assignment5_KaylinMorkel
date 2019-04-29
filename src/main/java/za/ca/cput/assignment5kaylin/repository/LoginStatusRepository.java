package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.LoginStatus;

import java.util.Set;

public interface LoginStatusRepository extends GenIRepository<LoginStatus, String>
{
    Set<LoginStatus> getAll();
}
