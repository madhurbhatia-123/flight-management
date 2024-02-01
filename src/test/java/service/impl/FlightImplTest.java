package service.impl;

import management.flight.model.Flight;
import management.flight.service.FlightService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
@ExtendWith(SpringExtension.class)
public class FlightImplTest {

    @Mock
    private FlightService flightService;

    @Test
    void testGetFlightByFlightNumber() {

        Flight mockFlight = new Flight("QF400", "MEL", "SYD", null, null);
        when(flightService.getFlightByFlightNumber(Mockito.anyString())).thenReturn(Optional.of(mockFlight));
        Optional<Flight> result = flightService.getFlightByFlightNumber("QF400");
        assertEquals("QF400", result.getFlightNumber());

    }
}
