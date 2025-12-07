// Create a class `Student` with a default constructor that prints “Object Created”
public class Car {

    String model;
    int year;
  

   Car( String model, int year){

    
     this.model = model;
     this.year = year;

   }


    void displayInfo(){
     System.out.println("Car Model: " + model);
     System.out.println(" Year: " + year);
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota blackdragon", 2020);
        car.displayInfo();
    }

    
    
        

   
}
