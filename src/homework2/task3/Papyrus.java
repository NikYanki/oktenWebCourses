package homework2.task3;

import lombok.*;

@NoArgsConstructor
@Data
@AllArgsConstructor
class Papyrus {
    private String topic;

    void page() {
        System.out.println("сторінка виготовлена з очерету");
    }

    void appearance() {
        System.out.println("має вигляд сувою");
    }

    void manufacturing() {
        System.out.println("ручне");
    }
}
