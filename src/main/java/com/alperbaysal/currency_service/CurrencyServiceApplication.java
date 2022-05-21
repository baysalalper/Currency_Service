package com.alperbaysal.currency_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CurrencyServiceApplication implements CommandLineRunner {

 /*   @Autowired
    private JdbcTemplate jdbcTemplate;

    private EvdsClientImpl evdsClientImpl = new EvdsClientImpl();

  */

    public static void main(String[] args) {
        SpringApplication.run(CurrencyServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //var response = evdsClientImpl.GetCurrency();

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
