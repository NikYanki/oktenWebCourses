package homework2.task2;

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
