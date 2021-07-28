package com.jed.studentinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessingDataMysqlApplication implements CommandLineRunner {

    @Autowired
    UserRepository userRepo;

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataMysqlApplication.class, args);
    }
    @Override
    public void run(String... arg0) throws Exception {
        for(User user : userRepo.search("a")) {
            System.out.println("Id: " + user.getId());
            System.out.println("Name: " + user.getName());
            System.out.println("Email: "+ user.getEmail());
            System.out.println("================================");
        }
    }
}