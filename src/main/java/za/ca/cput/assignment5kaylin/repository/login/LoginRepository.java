package za.ca.cput.assignment5kaylin.repository.login;

import za.ca.cput.assignment5kaylin.domain.login.Login;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface LoginRepository extends GenIRepository<Login, String>
{
    Set<Login> getAll();
}
