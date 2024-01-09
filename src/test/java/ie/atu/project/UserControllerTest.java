package ie.atu.project;

import ie.atu.project.userservicecicdproject2023.PersonDetails;
import ie.atu.project.userservicecicdproject2023.RegisterClient;
import ie.atu.project.userservicecicdproject2023.UserController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserControllerTest {
    @Test
    public void testConfirmAndRegister() {

        RegisterClientTest registerClientTest = new RegisterClientTest();

        //an instance of RegisterClientTest is used to construct an instance of UserController
        UserController userController = new UserController(registerClientTest);
        // PersonDetails object for testing
        PersonDetails personDetails = new PersonDetails("John Doe", "john@atu.ie");

        // Call the method to be tested.
        String outcome = userController.confirmAndRegister(personDetails);

        //Assert that the value of outcome is equal to the expected value "confirmation".
        assertEquals("confirmation", outcome);

        System.out.println("Test was successful");
    }

    //RegisterClientTest class implements the RegisterClient interface.
    //This class provides a simplified version of the RegisterClient interface for testing purposes.
    private static class RegisterClientTest implements RegisterClient {
        //Test the anyDetails method.
        public String anyDetails(PersonDetails personDetails) {
            return "confirmation";
        }
    }
}
