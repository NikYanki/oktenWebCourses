package homework2.task3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
class Book extends Papyrus {
    private int countOfPages;

    public Book(String topic, int countOfPages) {
        super(topic);
        this.countOfPages = countOfPages;
    }

    void page() {
        System.out.println("сторінка виготовлена з целюлози");
    }
    void appearance() {
        System.out.println("має вигляд зшитої стопки аркушів");
    }

    void manufacturing() {
        System.out.println("машинне");
    }

    @Override
    public String toString() {
        return "Book{" +
                "countOfPages=" + countOfPages +
                '}'+super.toString();
    }
}
