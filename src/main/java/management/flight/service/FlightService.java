package management.flight.service;

import management.flight.model.Flight;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface FlightService {


    Optional<Flight> getFlightByFlightNumber(String flightNumber);

    List<Flight> getAllFlights();
}
