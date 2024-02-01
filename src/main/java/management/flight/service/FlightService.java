package management.flight.service;

import management.flight.model.Flight;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FlightService {


    Flight getFlightByFlightNumber(String flightNumber);

    List<Flight> getAllFlights();
}
