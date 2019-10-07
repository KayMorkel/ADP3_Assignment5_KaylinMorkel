package za.ca.cput.assignment5kaylin.service.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.Church;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.List;
import java.util.Set;


public interface ChurchService extends GenIService<Church, String>
{
    Church retrieveById(String id);
    List<Church> getAll();
}
