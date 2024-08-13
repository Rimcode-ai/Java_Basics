public class ShoppingList {
    public static void main(String[] args) {
        String[] shoppingListSet = {"Potatoes", "Tomatoes", "Luxury Martian Rice"};
        boolean discount = true;

        for(String item : shoppingListSet){
            if (item.equals("Luxury Martian Rice") && discount){
                System.out.println("Buy " + item + " with discount");
            }
            else if (!item.equals("Luxury Martian Rice")){
                System.out.println(" Buy essential " + item);
            }
            else {
                System.out.println(" No discount. Skip " + item);
            }
        }
    }
}