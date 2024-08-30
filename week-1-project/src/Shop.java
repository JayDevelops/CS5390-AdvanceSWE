import java.util.HashMap;
import java.util.Map;

public class Shop {
    private HashMap<String, Item> inventory = new HashMap<>();

    public void addItemToInventory(Item item) {
        inventory.put(item.getName(), item);
    }

    public Item getItemFromInventory(String itemName) {
        return inventory.get(itemName);
    }

    public void viewInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty");
        } else {
            for (Item item : inventory.values()) {
                System.out.println(item);
            }
        }
    }
}
