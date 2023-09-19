package homework1.part2;

public class Test {
    public static void main(String[] args) {
        Post[] posts = new Post[]{
                new Post(1, 1, "xxx", "!!!"),
                new Post(2, 2, "xxx", "***"),
                new Post(3, 3, "xxx", "***"),
        };

        Comment[] comments = new Comment[]{
                new Comment(1, 1, "xxx", "man@mail.com", "..."),
                new Comment(2, 2, "xxx", "man@mail.com", "..."),
                new Comment(3, 3, "xxx", "man@mail.com", "..."),
        };

        for (Post post : posts) {
            System.out.println(post);
        }
        System.out.println();
        for (Comment comment : comments) {
            System.out.println(comment);
        }
    }
}