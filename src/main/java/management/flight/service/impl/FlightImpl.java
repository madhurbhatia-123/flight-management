package management.flight.service.impl;

import management.flight.model.Flight;
import management.flight.repository.FlightRepository;
import management.flight.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class FlightImpl implements FlightService {

    @Autowired
    private FlightRepository flightRepository;
    @Override
    public Optional<Flight> getFlightByFlightNumber(String flightNumber) {
        String departureTimeString = "2020-06-10T09:00:23Z";
        String  arrivalTimeString = "2020-06-10T10:25:23Z";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssX");
        LocalDateTime departureTime = LocalDateTime.parse(departureTimeString, formatter);
        LocalDateTime arrivalTime = LocalDateTime.parse(arrivalTimeString, formatter);

        return flightRepository.findById(flightNumber);
    }

    @Override
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }
}
