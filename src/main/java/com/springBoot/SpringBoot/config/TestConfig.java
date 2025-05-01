package com.springBoot.SpringBoot.config;

import com.springBoot.SpringBoot.entities.User;
import com.springBoot.SpringBoot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired //dependencia feita automaticamente
    private UserRepository userRepository;

    @Override //operações são feitas quando a aplicação rodar
    public void run(String... args) throws Exception {
        User user = new User(null, "cicer", "<EMAIL>", "87991683795",
                "cicer123");

        User user1 = new User(null, "leticia", "<EMAIL>", "7112812312",
                "leticiao");

        userRepository.saveAll(Arrays.asList(user, user1));
    }

}
