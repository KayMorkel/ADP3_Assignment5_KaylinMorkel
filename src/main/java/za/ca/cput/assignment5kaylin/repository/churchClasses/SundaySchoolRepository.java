package za.ca.cput.assignment5kaylin.repository.churchClasses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchClasses.SundaySchool;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;
@Repository
public interface SundaySchoolRepository extends JpaRepository<SundaySchool, String>
{
    //Set<SundaySchool> getAll();
}
