package mx.alfredo.expert;

public class Video {
    private String title;
    private String author;
    private long duration;

    public Video(String title, String author, long duration) {
        this.title = title;
        this.author = author;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "" +
                "title: '" + title + '\'' +
                ", author: '" + author + '\'' +
                ", duration: " + duration ;
    }
}
