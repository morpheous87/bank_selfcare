package yourbank.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yourbank.entity.Role;

/**
 * Created by Mario on 16.12.2016 г..
 */

public interface RoleRepository extends JpaRepository<Role, Integer>{

    Role findByName(String name);
}
