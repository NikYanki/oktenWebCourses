package homework2.task3;

public class Test {
        public static void main(String[] args) {
            Papyrus papyrus = new Papyrus("history");
            Book book = new Book("detective",100);
            Magazine magazine = new Magazine("science",20,true);
            Comics comics = new Comics("comedy",10, true);

            papyrus.appearance();
            papyrus.page();
            papyrus.manufacturing();
            System.out.println(papyrus);
            book.appearance();
            book.manufacturing();
            book.page();
            System.out.println(book);
            magazine.whatIs();
            magazine.appearance();
            magazine.manufacturing();
            magazine.page();
            System.out.println(magazine);
            comics.whatIs();
            comics.appearance();
            comics.manufacturing();
            comics.page();
            System.out.println(comics);
        }
    }

