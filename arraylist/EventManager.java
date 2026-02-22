package arraylist;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

  public class EventManager{
        public static void main(String[] args) {
            List<Event> Eventlist = new ArrayListist<>(); 
            Scanner input = new Scanner(System.in);
            boolean choice = true;

            while(choice){
                System.out.println("Enter the Event name :");
                String name = input.nextInt();

                System.out.println("Enter the date :");
                String name = input.nextInt();

                
                System.out.println("Enter the venue :");
                String name = input.nextInt();

                Eventlist.add(new Event(name,date,venue));

                 System.out.println("Do you want to continue adding? (y/n)");
            char c = input.next().charAt(0);

            input.nextLine();


            
            if (c == 'n' || c == 'N') {
                choice = false;
            }
        
            }

            System.out.println("Details :");


            for (Event Event : Eventlist) {
            System.out.println(Event);
        }


        }
  }


