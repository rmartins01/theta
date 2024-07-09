package br.com.theta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.theta.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    
}
