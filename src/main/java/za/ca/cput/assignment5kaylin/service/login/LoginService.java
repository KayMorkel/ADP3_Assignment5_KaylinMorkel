package za.ca.cput.assignment5kaylin.service.login;

import za.ca.cput.assignment5kaylin.domain.login.Login;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.List;
import java.util.Set;

public interface LoginService extends GenIService<Login, String>
{
    Login retrieveById(String id);
    List<Login> getAll();
}
