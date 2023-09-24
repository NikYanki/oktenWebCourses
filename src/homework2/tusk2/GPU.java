package homework2.tusk2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public enum GPU {
    AMD("AMD"),
    NVIDIA("NVIDIA"),
    INTEL("INTEL");

    private final String brand;


    }
