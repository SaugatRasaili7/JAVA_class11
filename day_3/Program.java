 import java.util.Scanner;
 package day_3;
  public class program{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Length of rectangle: ");
        double l = input.nextDouble();
        System.out.println("Enter the Breadth of rectangle: ");
        double b = input.nextDouble();

        Rectangle rec = new Rectangle(l , b);
        rec.area();
        rec.perimeter();
    
    }
  }