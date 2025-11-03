import java.util.Scanner;

public class Hobby {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Hobby and your Age :\n");


        String hobby = input.nextLine();
        
        int age = input.nextInt();
      
          System.out.println("Your Hobby is \t" + hobby + "\n Your age is " + age);

        input.close();
    }

}
