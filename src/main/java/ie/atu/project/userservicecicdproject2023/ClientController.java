package ie.atu.project.userservicecicdproject2023;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    private NotifyClient notifyClient;
    @Autowired
    public ClientController(NotifyClient notifyClient) {
        this.notifyClient = notifyClient;
    }
    @PostMapping("/inform")
    public String informDetails(@RequestBody PersonDetails personDetails) {
        String information = notifyClient.anyDetails(personDetails);
        return information;
    }
}
