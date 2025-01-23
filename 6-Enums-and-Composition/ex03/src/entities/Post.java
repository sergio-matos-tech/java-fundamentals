package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private LocalDateTime moment;
    private String title;
    private String content;
    private int amountOfLikes;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    private final List<Comment> comments = new ArrayList<>();

    public Post() {}

    public Post(String title, LocalDateTime moment, String content, int amountOfLikes) {
        this.title = title;
        this.moment = moment;
        this.content = content;
        this.amountOfLikes = amountOfLikes;
    }

    public int getAmountOfLikes() {
        return amountOfLikes;
    }

    public void setAmountOfLikes(int amountOfLikes) {
        this.amountOfLikes = amountOfLikes;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public String toString() {
        return "Post: \n" +
                "moment=" + moment.format(formatter) +
                "\ntitle='" + title + '\'' +
                "\ncontent='" + content + '\'' +
                "\namountOfLikes=" + amountOfLikes +
                "\ncomments=" + comments +
                '}';
    }
}
