package co.flexidev.theta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.flexidev.theta.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    
}
