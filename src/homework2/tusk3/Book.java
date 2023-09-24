package homework2.tusk3;

import lombok.NoArgsConstructor;

@NoArgsConstructor
class Book extends Papyrus {
    void page() {
        System.out.println("сторінка виготовлена з целюлози");
    }

    void appearance() {
        System.out.println("має вигляд зшитої стопки аркушів");
    }

    void manufacturing() {
        System.out.println("машинне");
    }
}
