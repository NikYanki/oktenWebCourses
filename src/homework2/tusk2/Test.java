package homework2.tusk2;

public class Test {

        public static void main(String[] args) {
            Laptop laptop = new Laptop();
            UltraBook ultraBook = new UltraBook();
            Workstation workstation = new Workstation();
            laptop.battery();
            laptop.monitor();
            laptop.processor();
            laptop.gpu();
            System.out.println();
            ultraBook.battery();
            ultraBook.monitor();
            ultraBook.processor();
            ultraBook.gpu();
            System.out.println();
            workstation.monitor();
            workstation.processor();
            workstation.gpu();
        }
}
