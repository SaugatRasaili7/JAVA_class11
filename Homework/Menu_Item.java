import java.util.Scanner;

public class Menu_Item {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu Item :\n");

        System.out.println("1.Burger\n");

        System.out.println("Pizza \n");

        System.out.println("Onion Rings\n");
        
        System.out.println("Grilled Chicken Sandwich\n");

         System.out.println("Garden Fresh Salad\n");

        System.out.println("Coffee\n");


        System.out.println("Enter your Food choice : \n");
      
        String menuItem = input.nextLine();

        System.out.println("The Entered Menu item is " + menuItem);



     input.close();

    }
}
