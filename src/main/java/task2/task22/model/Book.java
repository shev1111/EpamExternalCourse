package task2.task22.model;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pagesNumber;
    private int price;

    public Book(String name, String author, String publisher, int year, int pagesNumber, int price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pagesNumber = pagesNumber;
        this.price = price;
    }

    public Book(String name, String author, String publisher) {
        this(name,author,publisher,0,0,0);
    }

    public Book() {
        this("","","",0,0,0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pagesNumber=" + pagesNumber +
                ", price=" + price +
                '}'+"\n";
    }
}
