package in.lpu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieDataServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieDataServicesApplication.class, args);
	}

}
