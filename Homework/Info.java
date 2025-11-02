// Program in java to get name,address and class form user;

import java.util.Scanner;

public class Info{ 

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Name , Address and Class ");

        String name = input.nextLine();
        
        String address = input.nextLine();

        int grade = input.nextInt();
      
          System.out.println("The Entered Name is \t" + name + "\n The Entered address is \t" + address + "\n The Entered grade is \t" + grade );

        input.close();
    }
    
}