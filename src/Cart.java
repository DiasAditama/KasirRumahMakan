import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<MenuItem, Integer> items;

    public Cart() {
        items = new HashMap<>();
    }

    public void addItem(MenuItem item) {
        items.put(item, items.getOrDefault(item, 0) + 1);
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Menu Kosong");
            return;
        }

        int index = 1;
        for (Map.Entry<MenuItem, Integer> entry : items.entrySet()) {
            MenuItem item = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(index + ". " + item.getName() + " [" + quantity + "x] - Rp. " + (item.getPrice() * quantity));
            index++;
        }
    }

    public int calculateTotal() {
        int total = 0;
        for (Map.Entry<MenuItem, Integer> entry : items.entrySet()) {
            MenuItem item = entry.getKey();
            int quantity = entry.getValue();
            total += item.getPrice() * quantity;
        }
        return total;
    }
}
