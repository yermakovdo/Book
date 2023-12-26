import java.util.ArrayList;

class Book {
    private String ISBN;
    private String title;
    private String author;
    private int quantity;
    private double price;

    public Book(String ISBN, String title, String author, int quantity, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Количество: " + quantity);
        System.out.println("Цена(грн): " + price);
    }

    public void updateQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            quantity = newQuantity;
            System.out.println("Количество успешно обновлено!");
        } else {
            System.out.println("Неправильное количество. Количество не может быть отрицательным");
        }
    }

    public double calculateTotalValue() {
        return quantity * price;
    }
}
