package za.ca.cput.assignment5kaylin.service.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.UsageOfMoney;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.List;
import java.util.Set;

public interface UsageOfMoneyService extends GenIService<UsageOfMoney, String>
{
    UsageOfMoney retrieveById(String id);
    List<UsageOfMoney> getAll();
}
