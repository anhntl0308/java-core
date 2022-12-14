public class Author {
    private int id_author;
    private String name_author;

    public Author() {
    }

    public Author(int id_author, String name_author) {
        this.id_author = id_author;
        this.name_author = name_author;
    }

    public int getId_author() {
        return id_author;
    }

    public void setId_author(int id_author) {
        this.id_author = id_author;
    }

    public String getName_author() {
        return name_author;
    }

    public void setName_author(String name_author) {
        this.name_author = name_author;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id_author=" + id_author +
                ", name_author='" + name_author + '\'' +
                '}';
    }
}
