import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of which you want to find factorial : \n");
        int n = input.nextInt();
        int fact = 1;

        for(int i = 1; i<=n; i++){
            fact = fact * i;

        }

        System.out.println("The factorial of number " + n + " is : " + fact);
    }
}
