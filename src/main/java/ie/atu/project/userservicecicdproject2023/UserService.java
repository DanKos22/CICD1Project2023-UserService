package ie.atu.project.userservicecicdproject2023;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final PersonRepository personRepository;

    public UserService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public void saveCustomer(PersonDetails personDetails) {
        personRepository.save(personDetails);
    }
}
