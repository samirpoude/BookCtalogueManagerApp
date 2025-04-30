public class Books {
    String title;
    String authorName;

    public Books(String title, String authorName) {
        this.title = title;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                '}' + "\n ";
    }
}
