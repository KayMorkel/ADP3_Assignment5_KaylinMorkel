package za.ca.cput.assignment5kaylin.service.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.Collection;
import za.ca.cput.assignment5kaylin.service.GenIService;

import java.util.List;
import java.util.Set;

public interface CollectionService extends GenIService<Collection, String>
{
    Collection retrieveById(String id);
    List<Collection> getAll();
}
