package Model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Girl implements Human {
    private long fingers;
    private long legs;
    private long arms;
}
