package com.alperbaysal.currency_service;

import com.alperbaysal.currency_service.Application.ApiClients.EvdsClient;
import com.alperbaysal.currency_service.Infrastructure.ApiClients.IEvdsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Timestamp;
import java.time.Instant;

@SpringBootApplication
public class CurrencyServiceApplication implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private EvdsClient evdsClient = new EvdsClient();

    public static void main(String[] args)
    {
        SpringApplication.run(CurrencyServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        var response = evdsClient.GetCurrency();

//        Timestamp ts = Timestamp.from(Instant.now());
//        String sql = "INSERT INTO accounts (name, email, created_on) VALUES ("
//                + "'Alper Baysal', 'alper@hepsiburada', '" + ts+ "')";
//
//        int rows = jdbcTemplate.update(sql);
//        if(rows > 0)
//        {
//          System.out.println("A new row has been inserted!");
//        }
    }
}
