package homework2.additional;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        var comments = new ArrayList<Comment>();
        comments.add(new Comment(1, 1, "id ", "Eliseo@gardner.biz", "laudantium"));
        comments.add(new Comment(1, 2, "quo", "Jayne_Kuhic@sydney.com", "est"));
        comments.add(new Comment(1, 3, "odio", "Nikita@garfield.biz", "quia"));
        comments.add(new Comment(2, 1, "id", "Eliseo@gardner.biz", "laudantium"));
        comments.add(new Comment(2, 2, "quo", "Jayne_Kuhic@sydney.com", "est"));
        comments.add(new Comment(2, 3, "odio", "Nikita@garfield.biz", "quia"));
        comments.add(new Comment(3, 1, "id", "Eliseo@gardner.biz", "laudantium"));
        comments.add(new Comment(3, 2, "quo", "Jayne_Kuhic@sydney.com", "est"));
        comments.add(new Comment(3, 3, "odio", "Nikita@garfield.biz", "quia"));

        var posts = new ArrayList<Post>();
        posts.add(new Post(1, 1, "sunt aut facere repellat provident occaecati...", "quia et suscipit..."));
        posts.add(new Post(1, 2, "qui est esse", "est rerum tempore vitae..."));
        posts.add(new Post(1, 3, "ea molestias quasi exercitationem repellat qui ipsa sit aut", "et iusto sed quo iure..."));

        for (Post post : posts) {
            for (Comment comment : comments) {
                if (post.getId() == comment.getPostId()) {
                    post.addComment(comment);
                }
            }
        }

System.out.println(posts);
    }
}
