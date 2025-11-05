import java.util.Scanner;

public class Menu_Item {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name :\n");

        String name = input.nextLine();

        System.out.println("Enter your Food choice : \n");
      
        String menuItem = input.nextLine();

        System.out.println("The Entered Menu item by " + name +  " is " + menuItem);



     input.close();

    }
}
