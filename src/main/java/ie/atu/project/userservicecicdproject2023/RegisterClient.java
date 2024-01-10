package ie.atu.project.userservicecicdproject2023;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "verification-service", url = "http://registration-service:8081")
public interface RegisterClient {
    @PostMapping("/Verify")
    String anyDetails(@RequestBody PersonDetails personDetails);
}
