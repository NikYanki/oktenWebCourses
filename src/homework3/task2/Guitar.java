package homework3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Guitar implements Instrument {
    private int numberOfStrings;
    GuitarType type;

    public void play() {
        System.out.println(this.toString());
    }
}