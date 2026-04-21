public class RestoApp{
    public static void main(String[] args){
        //Leaves
        MenuItem burger = new MenuItem("Classic Burger", 250.00);
        MenuItem fries = new MenuItem("Large Fries", 85.00);
        MenuItem soda = new MenuItem("Root Beer", 60.00);

    //Sub-Composite
    MenuCategory barkadaMeal = new MenuCategory("Barkada Solo Meal");
    barkadaMeal.add(burger);
    barkadaMeal.add(fries);
    barkadaMeal.add(soda);
   
   //Leaf
   MenuItem vanillaSundae = new MenuItem("Vanilla Sundae", 45.00);

    //Top Composite
    MenuCategory mainMenu = new MenuCategory("Main Menu");
    mainMenu.add(barkadaMeal);
    mainMenu.add(vanillaSundae);

    //Test Output
    mainMenu.print();
    System.out.println("\n=========================================");
    System.out.println("Total Menu Value: ₱" + String.format("%.2f", mainMenu.getPrice()));
    
    }
}