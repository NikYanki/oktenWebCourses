package homework2.tusk4;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        User user = new User(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, new ArrayList<>(Arrays.asList(
                new Skill("java", 10),
                new Skill("js", 10),
                new Skill("c++", 10)
        )), new Car("toyota", 2021, 250));
        System.out.println(user.toString());
    }
}
