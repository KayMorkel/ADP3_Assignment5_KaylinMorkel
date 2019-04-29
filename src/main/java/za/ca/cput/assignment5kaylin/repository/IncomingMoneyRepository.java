package za.ca.cput.assignment5kaylin.repository;

import za.ca.cput.assignment5kaylin.domain.IncomingMoney;

import java.util.Set;

public interface IncomingMoneyRepository extends GenIRepository<IncomingMoney, String>
{
    Set<IncomingMoney> getAll();
}
