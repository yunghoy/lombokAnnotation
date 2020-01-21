package Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.NonFinal;

@Builder
@Value
@NonFinal
@AllArgsConstructor
public class Animal {

    private String name;
    private long numOfLegs;
}
