package ie.atu.project.userservicecicdproject2023;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private RegisterClient registerClient;

    @Autowired
    public UserController(RegisterClient registerClient) {
        this.registerClient = registerClient;
    }

}
