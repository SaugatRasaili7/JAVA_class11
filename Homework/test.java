import java.util.Scanner;

public class test {

    String person1;
    String person2;

    void inputNames() {
        Scanner input = new Scanner(System.in);

        System.out.println("==== Welcome to Rock-Paper-Scissor ====");

        while (true) {
            System.out.println("Enter input in lower case");

            System.out.print("Enter power of person1: ");
            person1 = input.nextLine();

            System.out.print("Enter power of person2: ");
            person2 = input.nextLine();

            if (person1.equals("rock") && person2.equals("rock") ||
                person1.equals("paper") && person2.equals("paper") ||
                person1.equals("scissor") && person2.equals("scissor")) {

                System.out.println("The match is draw");
            }

            else if (person1.equals("rock") && person2.equals("scissor") ||
                     person1.equals("paper") && person2.equals("rock") ||
                     person1.equals("scissor") && person2.equals("paper")) {

                System.out.println("Person 1 wins");
            }

            else if (person1.equals("rock") && person2.equals("paper") ||
                     person1.equals("paper") && person2.equals("scissor") ||
                     person1.equals("scissor") && person2.equals("rock")) {

                System.out.println("Person 2 wins");
            }

            else {
                System.out.println("Invalid input!");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        test t = new test();
        t.inputNames();
    }
}
