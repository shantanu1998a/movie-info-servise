package in.nit.moviecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieInfoServiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServiseApplication.class, args);
	}

}
