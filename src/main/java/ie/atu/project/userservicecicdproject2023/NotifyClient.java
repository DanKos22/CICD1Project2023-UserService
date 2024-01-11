package ie.atu.project.userservicecicdproject2023;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "affirm", url = "http://notification-service:8082")
public interface NotifyClient {

    @PostMapping("/join")
    String anyDetails(@RequestBody PersonDetails personDetails);
}
