import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items = new ArrayList<Item>();
    private double totalPrice;

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotal() {
        double tempTotalPrice = 0;

        for (Item item : items) {
            tempTotalPrice += item.getPrice();
        }

        this.totalPrice = tempTotalPrice;
        return totalPrice;
    }

    public void viewCart() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty");
        } else {
            for (Item item : items) {
                System.out.println(item.getName());
            }

            System.out.println("Total: $" + this.totalPrice);
        }
    }
}
