import java.util.Scanner;

public class Fact {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int fact=1;
    int n;


    System.out.println("Enter a number to find factorial of that number");
    n = input.nextInt();

    for(int i =1; i<=n; i++){
        
        fact = fact*i;
    }
    System.out.println("factorial " + fact);
 }   
}
