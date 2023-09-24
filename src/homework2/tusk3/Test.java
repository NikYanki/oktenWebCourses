package homework2.tusk3;

public class Test {
        public static void main(String[] args) {
            Papyrus papyrus = new Papyrus();
            Book book = new Book();
            Magazine magazine = new Magazine();
            Comics comics = new Comics();

            papyrus.appearance();
            papyrus.page();
            papyrus.manufacturing();
            System.out.println();
            book.appearance();
            book.manufacturing();
            book.page();
            System.out.println();
            magazine.whatIs();
            magazine.appearance();
            magazine.manufacturing();
            magazine.page();
            System.out.println();
            comics.whatIs();
            comics.appearance();
            comics.manufacturing();
            comics.page();
        }
    }

