package homework2.tusk4;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {
    MALE("male"),
    FEMALE("female");
    private final String gender;
}
