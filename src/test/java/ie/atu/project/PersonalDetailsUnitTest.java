package ie.atu.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonalDetailsUnitTest {

    @Test
    public void NoArgsConstructorTest() {
        PersonDetails personDetails = new PersonDetails();

        assertNotNull(personDetails);
        assertNotNull(personDetails.getName());
        assertNotNull(personDetails.getEmail());
    }

    @Test
    public void AllArgsConstructorTest() {
        String name = "John Doe";
        String email = "john@atu.ie";

        PersonDetails personDetails = new PersonDetails(name, email);
        assertNotNull(personDetails);
        assertEquals(name, personDetails.getName());
        assertEquals(email, personDetails.getEmail());
    }

    @Test
    public void GetterAndSetterTest() {

        PersonDetails personDetails = new PersonDetails();
        String name = "John Doe";
        String email = "john@atu.ie";

        personDetails.setName(name);
        personDetails.setEmail(email);

        assertEquals("John Doe", personDetails.getName());
        assertEquals(email, personDetails.getEmail());

    }

    public class PersonDetails {
        String name;
        String email;

        public PersonDetails(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public PersonDetails() {
            this.name = "";
            this.email = "";
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }
    }
}
