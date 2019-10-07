package za.ca.cput.assignment5kaylin.repository.churchPersons;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchPersons.LayMinister;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;
@Repository
public interface LayMinisterRepository extends JpaRepository<LayMinister, String>
{
    //Set<LayMinister> getAll();
}
