package romenska.olha.persons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PersonsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonsServiceApplication.class, args);
    }

}
