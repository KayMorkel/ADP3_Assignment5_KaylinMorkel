package za.ca.cput.assignment5kaylin.service.login;

import za.ca.cput.assignment5kaylin.domain.login.LoginStatus;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.List;
import java.util.Set;

public interface LoginStatusService extends GenIService<LoginStatus, String>
{
    LoginStatus retrieveById(String id);
    List<LoginStatus> getAll();
}