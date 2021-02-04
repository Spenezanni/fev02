package br.com.fev02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fev02.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer > {

}
