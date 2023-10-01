package homework2.task2;


import lombok.*;

@NoArgsConstructor
@Getter
@Setter
class Laptop extends PC implements Battery {
    private HardDrive hardDrive;
    private GPU gpu;
    private  boolean battery;
    private  boolean batteryIntegrated;

    public Laptop(int CoreOfProcessor, int RAM, double frequency, HardDrive hardDrive, GPU gpu) {
        super(CoreOfProcessor, RAM, frequency);
        this.hardDrive = hardDrive;
        this.gpu = gpu;
        this.battery = isHaveABattery(true);
        this.batteryIntegrated =isBatteryIntegrated(false);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "hardDrive=" + hardDrive +
                ", gpu=" + gpu +
                ", battery=" + battery +
                ", batteryIntegrated=" + batteryIntegrated +
               super.toString();
    }
}
