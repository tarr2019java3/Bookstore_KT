public class Book {
    private String name;
    private Author author;
    private Categories category;

    public Book(String name, Author author, Categories category){
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public Book(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }
}
