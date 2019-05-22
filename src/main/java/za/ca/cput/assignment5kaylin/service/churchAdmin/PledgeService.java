package za.ca.cput.assignment5kaylin.service.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.Pledge;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.Set;

public interface PledgeService extends GenIService<Pledge, String>
{
    Set<Pledge> getAll();
}
