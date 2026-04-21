import java.util.ArrayList;
import java.util.List;

public class MenuCategory implements MenuComponent {
    private String categoryName;
    private List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();

    public MenuCategory(String name) {
        this.categoryName = name;
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    @Override
    public double getPrice(){
        double total = 0;
        for(MenuComponent component : menuComponents){
            total += component.getPrice();
        }
        return total;
    }

    @Override
    public void print(){
        System.out.println("--- " + categoryName.toUpperCase() + " ---");
        for(MenuComponent component : menuComponents){
            component.print();
        }
    }
}