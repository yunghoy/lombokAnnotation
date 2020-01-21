package Model;

import lombok.Data;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NonFinal
public class Vehicle {
    private long wheels;
    private String name;
}
