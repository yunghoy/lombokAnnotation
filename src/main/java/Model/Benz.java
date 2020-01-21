package Model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Benz {
    private long wheels;
    private String name;
}
