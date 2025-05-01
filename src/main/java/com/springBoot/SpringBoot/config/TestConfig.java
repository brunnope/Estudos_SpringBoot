package com.springBoot.SpringBoot.config;

import com.springBoot.SpringBoot.entities.Order;
import com.springBoot.SpringBoot.entities.User;
import com.springBoot.SpringBoot.repositories.OrderRepository;
import com.springBoot.SpringBoot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired //dependencia feita automaticamente
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override //operações são feitas quando a aplicação rodar
    public void run(String... args) throws Exception {
        User user = new User(null, "cicer", "<EMAIL>", "87991683795",
                "cicer123");

        User user1 = new User(null, "leticia", "<EMAIL>", "7112812312",
                "leticiao");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), user);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), user1);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), user);

        userRepository.saveAll(Arrays.asList(user, user1));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }

}
