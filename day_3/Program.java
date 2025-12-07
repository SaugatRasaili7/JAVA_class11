package day_3;
 import java.util.Scanner;

  public class program{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Length of rectangle: ");

        double length = input.nextDouble();
        
        System.out.println("Enter the Breadth of rectangle: ");
        double breadth = input.nextDouble();

        Rectangle rec = new Rectangle(length,breadth );
        rec.area();
        rec.perimeter();
    
    }
  }