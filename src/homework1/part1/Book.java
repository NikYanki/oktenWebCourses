package homework1.part1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book {
    private String title;
    private int pages;
    private String[] Authors;
    private String genre;


}
