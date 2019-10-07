package za.ca.cput.assignment5kaylin.repository.churchClasses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchClasses.Class;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;
@Repository
public interface ClassRepository extends JpaRepository<Class, String>
{
    //Set<Class> getAll();
}
