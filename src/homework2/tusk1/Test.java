package homework2.tusk1;

public class Test {

    public static void main(String[] args) {
        User user = new User(1, "Leanne Graham", "Bret", "Sincere@april.biz", new Address("Kulas Light", "Apt. 556",
                "Gwenborough", "92998-3874", new Geo("-37.3159", "81.1496")), "1-770-736-8031 x56442",
                "hildegard.org", new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets"));
        System.out.println(user.toString());
    }
}
