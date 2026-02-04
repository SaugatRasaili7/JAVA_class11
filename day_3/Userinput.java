import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a[] = new int[5];

        for(int i=0; i<a.length; i++){ 

            System.out.print("Enter number: ");
            a[i]= input.nextInt();
        }

        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

    }
}