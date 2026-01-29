import java.io.*;
import java.util.Scanner;

public class File_Handling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fileName = "abc.txt";

        try {
            // -------- WRITING TO FILE --------
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

    
            
               System.out.print("Enter name of student :");
                String name = sc.nextLine();
                writer.write(name);
                writer.newLine(); // move to next line
          

             
               System.out.print("Class:");
                String grade = sc.nextLine();
                writer.write(grade);
                writer.newLine(); // move to next line
          
             

            writer.close();
            System.out.println("\nData saved to file successfully!");

            // -------- READING FROM FILE --------
            System.out.println("\nReading data from file:");
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Student: " + line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error handling file.");
            e.printStackTrace();
        }

        sc.close();
    }
}