package za.ca.cput.assignment5kaylin.service.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.LayMinister;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.List;
import java.util.Set;

public interface LayMinisterService extends GenIService<LayMinister, String>
{
    LayMinister retrieveById(String id);
    List<LayMinister> getAll();
}
