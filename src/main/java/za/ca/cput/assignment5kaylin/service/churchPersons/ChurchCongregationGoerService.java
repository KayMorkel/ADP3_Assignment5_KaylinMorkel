package za.ca.cput.assignment5kaylin.service.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.Church;
import za.ca.cput.assignment5kaylin.domain.churchPersons.ChurchCongregationGoer;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.List;
import java.util.Set;

public interface ChurchCongregationGoerService extends GenIService<ChurchCongregationGoer, String>
{
    ChurchCongregationGoer retrieveById(String id);
    List<ChurchCongregationGoer> getAll();
}
