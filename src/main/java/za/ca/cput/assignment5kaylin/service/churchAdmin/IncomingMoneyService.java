package za.ca.cput.assignment5kaylin.service.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.IncomingMoney;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.Set;

public interface IncomingMoneyService extends GenIService<IncomingMoney, String>
{
    Set<IncomingMoney> getAll();
}
