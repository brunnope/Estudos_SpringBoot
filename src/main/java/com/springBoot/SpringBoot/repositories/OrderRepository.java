package com.springBoot.SpringBoot.repositories;

import com.springBoot.SpringBoot.entities.Order;
import com.springBoot.SpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//so com essa definição já estar pronto para fazer operações de
//CRUD com o banco de dados automaticamente
public interface OrderRepository extends JpaRepository<Order, Long> {

}
