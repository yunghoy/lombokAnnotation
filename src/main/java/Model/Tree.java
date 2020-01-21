package Model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public abstract class Tree {
    private long age;
    private String name;
}
