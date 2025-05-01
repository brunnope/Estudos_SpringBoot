package com.springBoot.SpringBoot.repositories;

import com.springBoot.SpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//so com essa definição já estar pronto para fazer operações de
//CRUD com o banco de dados automaticamente
public interface UserRepository extends JpaRepository<User, Long> {

}
