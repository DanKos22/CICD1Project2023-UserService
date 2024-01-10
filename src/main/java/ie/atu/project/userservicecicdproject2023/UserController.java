package ie.atu.project.userservicecicdproject2023;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private RegisterClient registerClient;



    @Autowired
    public UserController(RegisterClient registerClient) {
        this.registerClient = registerClient;

    }

    @PostMapping("/confirm-and-register")
    public String confirmAndRegister(@RequestBody PersonDetails personDetails) {
        String affirm = registerClient.anyDetails(personDetails);
        return affirm;
    }

}
