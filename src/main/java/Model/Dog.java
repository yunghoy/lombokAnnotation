package Model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Dog {

    private String name;
    private long numOfLegs;
}
