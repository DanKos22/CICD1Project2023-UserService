package ie.atu.project.userservicecicdproject2023;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private RegisterClient registerClient;
    private NotifyClient notifyClient;

    @Autowired
    public UserController(RegisterClient registerClient) {
        this.registerClient = registerClient;
    }

    public UserController(NotifyClient notifyClient) {
        this.notifyClient = notifyClient;
    }

    @PostMapping("/confirm-and-register")
    public String confirmAndRegister(@RequestBody PersonDetails personDetails) {
        String affirm = registerClient.anyDetails(personDetails);
        return affirm;
    }

    @PostMapping("/inform")
    public String informDetails(@RequestBody PersonDetails personDetails) {
        String information = notifyClient.anyDetails(personDetails);
        return information;
    }
}
