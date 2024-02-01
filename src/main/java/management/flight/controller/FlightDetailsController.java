package management.flight.controller;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import management.flight.model.Flight;
import management.flight.service.FlightService;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/flight-api")
@Slf4j
@AllArgsConstructor
@Validated
public class FlightDetailsController {

    private FlightService flightService;
    
    @GetMapping(value = "/flightNumber/{flightNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
    @SneakyThrows
    public Flight getOrderDetails(@PathVariable(value = "flightNumber")  String flightNumber) {
        return flightService.getFlightByFlightNumber(flightNumber);
    }

}
