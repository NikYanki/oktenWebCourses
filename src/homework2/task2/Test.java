package homework2.task2;

public class Test {

        public static void main(String[] args) {
            Laptop laptop = new Laptop(4,8,3.1,HardDrive.HDD,GPU.INTEL);
            System.out.println(laptop);
            UltraBook ultraBook = new UltraBook(8,8,2.2,HardDrive.SSD,GPU.AMD,1.5);
            System.out.println(ultraBook);
            Workstation workstation = new Workstation(24,128,4.2,HardDrive.SSD,GPU.INTEL,3000.99);
            System.out.println(workstation);

        }
}
