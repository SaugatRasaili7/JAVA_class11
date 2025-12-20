import java.util.Scanner;

public class Large {
    int num1;
    int num2;
    int num3;

    void get_input(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers:\n");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

    }

    void check(){
        if(num1>num2 && num1>num3){
            System.out.println("The number "+ num1 +" is greater among all");
        }

        else if(num2>num1 && num2>num3){
            System.out.println("The number "+num2 + " is greater among all");
        }
    

    else{
        System.out.println("The number "+num3 + " is greater among all");
    }

}

  

public static void main(String[] args) {
    Large lg = new Large();
    lg.get_input();
    lg.check();
}


}




