package homework2.task2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
class UltraBook extends Laptop{
private double weight;
public UltraBook(int CoreOfProcessor, int RAM, double frequency, HardDrive hardDrive, GPU gpu, double weight){
    super(CoreOfProcessor,RAM,frequency,hardDrive,gpu);
    this.weight =weight;
    super.setBatteryIntegrated(true);
}

    @Override
    public String toString() {
        return "UltraBook{" +
                "weight=" + weight +
                '}'+super.toString();
    }
}