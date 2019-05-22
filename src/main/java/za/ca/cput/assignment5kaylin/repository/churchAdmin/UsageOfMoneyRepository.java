package za.ca.cput.assignment5kaylin.repository.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.UsageOfMoney;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface UsageOfMoneyRepository extends GenIRepository<UsageOfMoney, String>
{
    Set<UsageOfMoney> getAll();
}
