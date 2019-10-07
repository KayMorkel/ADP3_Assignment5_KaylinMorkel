package za.ca.cput.assignment5kaylin.repository.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.login.Login;
import za.ca.cput.assignment5kaylin.repository.GenIRepository;

import java.util.Set;
@Repository
public interface LoginRepository extends JpaRepository<Login, String>
{
    //Set<Login> getAll();
}
