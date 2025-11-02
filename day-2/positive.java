import java.util.Scanner;

public class positive{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int num = input.nextInt();

        if(num<0){
            System.out.println("The number" + num + "is Negative");

        }
        else{
            System.out.println("The number" + num + "is positive");
        }
        
        input.close();
    }
    
}