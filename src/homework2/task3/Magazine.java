package homework2.task3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
class Magazine extends Book {
    private boolean isUseful;

    public Magazine(String topic, int countOfPages, boolean isUseful) {
        super(topic, countOfPages);
        this.isUseful = isUseful;
    }

    void whatIs() {
        System.out.println("інтервю, обзори, новини");
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "isUseful=" + isUseful +
                '}'+super.toString();
    }
}
