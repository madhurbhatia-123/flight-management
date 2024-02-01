package management.flight.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class Flight {

    private String flightNumber;

    private String departurePort;

    private String arrivalPort;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

}
