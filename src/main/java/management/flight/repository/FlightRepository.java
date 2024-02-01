package management.flight.repository;

import management.flight.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, String> {

}
