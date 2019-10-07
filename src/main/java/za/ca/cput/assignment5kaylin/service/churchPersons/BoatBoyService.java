package za.ca.cput.assignment5kaylin.service.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.BoatBoy;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.List;
import java.util.Set;

public interface BoatBoyService extends GenIService<BoatBoy, String>
{
    BoatBoy retrieveById(String id);
    List<BoatBoy> getAll();
}
