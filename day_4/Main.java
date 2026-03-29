import java.util.Scanner;
class Student{
    String name;
    int grade;
   

    public void study(){
        System.out.println("I studied very Well");
    }

    
}

 class Saugat extends Student{
    Scanner input = new Scanner(System.in);
      public void hobby(){
        
        System.out.println("My Hobby is Singing Songs");

      }

      public void details(){
             System.out.println("Enter your name :");
             name = input.nextLine();

              System.out.println("Enter your grade :");
             grade = input.nextInt();
      }


      public void showdetails(){
             System.out.println("Your name is :" + name);
           

              System.out.println("Your grade is:" + grade);
         
      }

 
}

    
    public class Main{

         public static void main(String args[]){ 
           Saugat s1 = new Saugat();
           s1.study();
           s1.hobby();
           s1. details();
           s1.showdetails();

          }
    }



