package ba.daan.crud_postgres.repository;

import ba.daan.crud_postgres.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    /*
    // Custom query method to find users by their name
    List<User> findByName(String name);

    // Custom query method using JPQL to find users by email
    @Query("SELECT u FROM User u WHERE u.email = :email")
    User findUserByEmail(@Param("email") String email);

    // Custom query method to find users with pagination
    @Query("SELECT u FROM User u")
    List<User> findAllUsersWithPagination(Pageable pageable);

 */
}
