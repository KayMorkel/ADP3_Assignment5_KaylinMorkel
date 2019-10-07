package za.ca.cput.assignment5kaylin.repository.churchPersons;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchPersons.ChurchCongregationGoer;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;
@Repository
public interface ChurchCongregationGoerRepository extends JpaRepository<ChurchCongregationGoer, String>
{
    //Set<ChurchCongregationGoer> getAll();
}
