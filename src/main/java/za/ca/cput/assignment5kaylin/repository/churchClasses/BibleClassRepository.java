package za.ca.cput.assignment5kaylin.repository.churchClasses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchClasses.BibleClass;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;
@Repository
public interface BibleClassRepository extends JpaRepository<BibleClass, String>
{
    //Set<BibleClass> getAll();
}
