package yourbank.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yourbank.entity.User;

/**
 * Created by Mario on 15.12.2016 г..
 */

public interface UserRepository extends JpaRepository<User, Integer>{

    User findByEmail(String email);
}
