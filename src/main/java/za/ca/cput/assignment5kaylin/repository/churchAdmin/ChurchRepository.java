package za.ca.cput.assignment5kaylin.repository.churchAdmin;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Church;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;

@Repository
public interface ChurchRepository extends JpaRepository<Church, String>
{
    //Set<Church> getAll();
}
