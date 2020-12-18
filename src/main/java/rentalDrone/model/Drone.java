package rentalDrone.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "drones")
public class Drone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long droneId;
    private long droneIdentificationSeries;
    private String droneModel;
}
