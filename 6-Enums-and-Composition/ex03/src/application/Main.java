package application;


import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDateTime localDateTime = LocalDateTime.now();

        Post post1 = new Post("Elden Ring", localDateTime, "May Caos Rule the World", 89);

        Comment comment1 = new Comment("Good Game!");
        Comment comment2 = new Comment("This game is marvelous!");
        post1.addComment(comment1);
        post1.addComment(comment2);

        System.out.println(post1);

        input.close();
    }
}
