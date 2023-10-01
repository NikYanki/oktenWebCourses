package homework2.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public enum HardDrive {
    SSD("SSD"),
    HDD("HDD");

    private final String type;
}