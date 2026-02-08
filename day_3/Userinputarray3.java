import java.util.Scanner;
public class Userinputarray3{
  public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     String a[] = new String[5];


     for(int i=0; i<a.length; i++){
        
     System.out.println("Enter the names of a " + "[" + i + "]" + ":");
       a[i] = input.nextLine();
     }

     

     for(int i=0; i<a.length; i++){
        System.out.println("The name of a "+ "[" + i + "]" +"is :" + a[i]);
      
     }

  }
    
    }
