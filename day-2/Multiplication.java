  import java.util.Scanner;
  public class Multiplication {

    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      

        System.out.println("===Enter the number of which you wanted to display the Multiplication Table up to 10 === \n");
        int n = input.nextInt();
        System.out.println("The Multiplication table of " + n + "is : \n");
        
        for(int i =1; i<=10; i++){
          System.out.println(n + " * " + i +" = " + n*i);
        }

    }
  }