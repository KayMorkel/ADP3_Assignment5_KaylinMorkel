package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.UsageOfMoney;

import java.util.Set;

public interface UsageOfMoneyRepository extends GenIRepository<UsageOfMoney, String>
{
    Set<UsageOfMoney> getAll();
}
