package management.flight.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class FlightRequest {

    @NotNull("Flight Number should not be empty")
    private String flightNumber;
    @NotNull("Departure Port should not be empty")
    private String departurePort;
    @NotNull("Arrival Port should not be empty")
    private String arrivalPort;
    @NotNull("Departure Time should not be empty")
    private LocalDateTime departureTime;
    @NotNull("Arrival Time should not be empty")
    private LocalDateTime arrivalTime;

}
