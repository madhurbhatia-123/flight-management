package management.flight.service;

import management.flight.model.Flight;
import org.springframework.stereotype.Component;

@Component
public interface FlightService {


    Flight getFlightByFlightNumber(String flightNumber);
}
