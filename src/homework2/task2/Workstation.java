package homework2.task2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
class Workstation extends Laptop {
    private double price;

    public Workstation(int CoreOfProcessor, int RAM, double frequency, HardDrive hardDrive, GPU gpu, double price) {
        super(CoreOfProcessor, RAM, frequency, hardDrive, gpu);
        this.price = price;
    }
    @Override
    public String toString() {
        return "Workstation{" +
                "price=" + price +
                '}'+super.toString();
    }
}