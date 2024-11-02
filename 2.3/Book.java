public class Book {
    private String isbn;
    private String name;
    private String author;
    private double price;
    private int qty;
    public Book(String isbn, String name, String author, double price) {}
    public Book(String isbn, String name, String author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String getAuthorName(){
        return author;
    }
    public String toString(){
        return isbn + " " + name + " " + author + " " + price + " " + qty;
    }
}
