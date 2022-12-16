package main.java.springDiahelp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
@EnableMysqlRepositories
public class DiahelpApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiahelpApplication.class, args);
	}
	
}
