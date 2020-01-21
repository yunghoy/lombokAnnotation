package Model;

import lombok.NonNull;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Oak extends Tree {
    private long age;
    private String name;
    private String type;
}
