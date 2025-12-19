import java.util.Scanner;
public class  Numberguessingadvance {
   int secretNum;
   int num2;
 

   Numberguessingadvance(){
    secretNum =(int)( Math.random()*100)+1;
    System.out.println("secret number"+ secretNum);

   }
   
   void check(){

       Scanner input = new Scanner(System.in);
       boolean check = true;
        int attempt =1;
  
     while(check){
        System.out.println("Enter the number from 1 to 100");
        num2 = input.nextInt();

        int difference = secretNum - num2;

        if(num2>60 && num2<100){    
            System.out.println("Your number " + num2 + " is closer to the guess number");
            attempt++;
        }

        else if(num2<20 && num2>1){
            System.out.println("Your number " + num2 + " is too smaller");
            attempt++;
        }

        
        else if(num2<50 && num2>40){
            System.out.println("Your number " + num2 + " is smaller");
            attempt++;
        }

        
        else if(num2<60 && num2>50){
            System.out.println("Your number " + num2 + " is  smaller");
            attempt++;
        }

        
        else if(num2<75 && num2>70){
            System.out.println("Your number " + num2 + " is nearer to guess number");
            attempt++;
        }

       
         else if(num2==secretNum){
               System.out.println("Your number " + num2 + " guess is correct");
               check = false;
               System.out.println("You guessed in  " + attempt + " attempt");

         }
        else {
       
            System.out.println("Your guessed is out of range, please try again");
        

         
        
      }

    
     
     }
   }

   public static void main(String[] aargs){
 
     Numberguessingadvance ng = new Numberguessingadvance();
     ng.check();

   }
}
        