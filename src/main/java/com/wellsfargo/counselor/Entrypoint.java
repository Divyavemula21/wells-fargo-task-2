package com.wellsfargo.counselor;

import com.wellsfargo.counselor.entity.Advisor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Entrypoint {

    public static void main(String[] args) {

        SpringApplication.run(Entrypoint.class, args);

        Advisor a = new Advisor();
        a.setFirstName("Divya");
        a.setLastName("Vemula");
        a.setAddress("6 davis st");
        a.setPhone("1234567890");
        a.setEmail("divya@example.com");
        System.out.println(a);   // calls toString()
    }
}
