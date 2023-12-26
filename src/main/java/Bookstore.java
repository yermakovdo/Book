import java.util.ArrayList;

class Bookstore {
    private ArrayList<Book> inventory;

    public Bookstore() {
        inventory = new ArrayList<>();
    }

    public void addBook(Book book) {
        inventory.add(book);
    }

    public void displayInventory() {
        System.out.println("Сведения об инвентаре:");
        for (Book book : inventory) {
            book.displayDetails();
        }
    }

    public void updateBookQuantity(int index, int newQuantity) {
        if (index >= 0 && index < inventory.size()) {
            inventory.get(index).updateQuantity(newQuantity);
        } else {
            System.out.println("Неправильный книжный индекс");
        }
    }

    public double calculateTotalInventoryValue() {
        double totalValue = 0.0;
        for (Book book : inventory) {
            totalValue += book.calculateTotalValue();
        }
        return totalValue;
    }
}
