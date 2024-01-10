package ie.atu.project.userservicecicdproject2023;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonDetails, Long> {

}
