package za.ca.cput.assignment5kaylin.repository.churchClasses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchClasses.BaptismClass;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;
@Repository
public interface BaptismClassRepository extends JpaRepository<BaptismClass, String>
{
    //Set<BaptismClass> getAll();
}
