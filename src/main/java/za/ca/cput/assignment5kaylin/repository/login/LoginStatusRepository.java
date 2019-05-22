package za.ca.cput.assignment5kaylin.repository.login;

import za.ca.cput.assignment5kaylin.domain.login.LoginStatus;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface LoginStatusRepository extends GenIRepository<LoginStatus, String>
{
    Set<LoginStatus> getAll();
}
