package za.ca.cput.assignment5kaylin.repository.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.IncomingMoney;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

public interface IncomingMoneyRepository extends GenIRepository<IncomingMoney, String>
{
    Set<IncomingMoney> getAll();
}
