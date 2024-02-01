package management.flight.service.impl;

import management.flight.model.Flight;
import management.flight.service.FlightService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class FlightImpl implements FlightService {
    @Override
    public Flight getFlightByFlightNumber(String flightNumber) {
        String departureTimeString = "2020-06-10T09:00:23Z";
        String  arrivalTimeString = "2020-06-10T10:25:23Z";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssX");
        LocalDateTime departureTime = LocalDateTime.parse(departureTimeString, formatter);
        LocalDateTime arrivalTime = LocalDateTime.parse(arrivalTimeString, formatter);

        return Flight.builder().flightNumber("QF400").departurePort("MEL").arrivalPort("SYD")
                .departureTime(departureTime)
                .arrivalTime(arrivalTime).build();
    }
}
