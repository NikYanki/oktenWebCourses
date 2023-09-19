package homework1.part1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        library[0] = new Book("1000year", 100, new String[]{"author 1", "author2"}, "action");
        library[1] = new Book("1000year", 100, new String[]{"author 1", "author2"}, "action");
        library[2] = new Book("1000year", 100, new String[]{"author 1", "author2"}, "action");
        library[3] = new Book("1000year", 100, new String[]{"author 1", "author2"}, "action");
        library[4] = new Book("1000year", 100, new String[]{"author 1", "author2"}, "action");

        Car[] parking = new Car[]{
                new Car("Audi", 120, 1.6, true),
                new Car("BMW", 150, 2.6, true),
                new Car("Kia", 125, 2.0, false),
                new Car("OKA", 5, 0.5, true),
                new Car("LADA", 1, 0.1, false),
        };
        ArrayList<Dog> zoo = new ArrayList<Dog>();
        zoo.add(new Dog("max", 5, "retriever"));
        zoo.add(new Dog("max", 1, "retriever"));
        zoo.add(new Dog("Sharik", 3, "retriever"));

        for (Book book : library) {
            System.out.println(book);
        }
        System.out.println();
        int i = 0;
        while (i < parking.length) {
            System.out.println(parking[i]);
            i++;
        }
        System.out.println();

        for (int j = 0; j < zoo.size(); j++) {
            System.out.println(zoo.get(j));
        }
    }

}
