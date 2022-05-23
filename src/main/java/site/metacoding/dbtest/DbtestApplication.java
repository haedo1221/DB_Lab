package site.metacoding.dbtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DbtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbtestApplication.class, args);
	}

}
