package ie.atu.project.userservicecicdproject2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class UserServiceCicdProject2023Application {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceCicdProject2023Application.class, args);
    }

}
