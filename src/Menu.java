import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItems;

    public Menu() {
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Ayam Geprek", 5000));
        menuItems.add(new MenuItem("Nasi Goreng", 10000));
        menuItems.add(new MenuItem("Sate Ayam", 15000));
        menuItems.add(new MenuItem("Bebek Goreng", 20000));
        menuItems.add(new MenuItem("Steak Bakar", 30000));
    }

    public void displayMenu() {
        int index = 1;
        for (MenuItem item : menuItems) {
            System.out.print(index + ". " + item.getName() + " - Rp. " + item.getPrice());
            System.out.println();
            index++;
        }
    }

    public MenuItem getMenuItem(int choice) {
        if (choice >= 1 && choice <= menuItems.size()) {
            return menuItems.get(choice - 1);
        }
        return null;
    }
}
