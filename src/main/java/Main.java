import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bookstore bookstore = new Bookstore();

        System.out.println("Введите данные о книге:");

        System.out.print("ISBN: ");
        String ISBN = scanner.nextLine();

        System.out.print("Название: ");
        String title = scanner.nextLine();

        System.out.print("Автор: ");
        String author = scanner.nextLine();

        System.out.print("Количество: ");
        int quantity = scanner.nextInt();

        System.out.print("Цена(грн): ");
        double price = scanner.nextDouble();

        Book book1 = new Book(ISBN, title, author, quantity, price);
        bookstore.addBook(book1);

        bookstore.displayInventory();

        System.out.println("Смоделируйте покупки и продажи книг:");
        System.out.print("Введите индекс книги чтобы обновить количество: ");
        int bookIndex = scanner.nextInt();

        System.out.print("Введите новое количество: ");
        int newQuantity = scanner.nextInt();

        bookstore.updateBookQuantity(bookIndex, newQuantity);

        bookstore.displayInventory();

        double totalValue = bookstore.calculateTotalInventoryValue();
        System.out.println("Общая стоимость: " + totalValue);
    }
}
