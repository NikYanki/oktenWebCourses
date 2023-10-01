package homework2.task3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
class Comics extends Book {
    private boolean isColor;

    public Comics(String topic, int countOfPages, boolean isColor) {
        super(topic, countOfPages);
        this.isColor = isColor;
    }

    void whatIs() {
        System.out.println("ілюстровані історії");
    }

    @Override
    public String toString() {
        return "Comics{" +
                "isColor=" + isColor +
                '}'+super.toString();
    }
}
