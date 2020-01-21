package Model;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.Delegate;

@Builder
@Value
public class Cat {

    @Delegate private Animal animal;
    private String tag;
}
