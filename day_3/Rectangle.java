 package day_3;
   public class Rectangle {

  private:

  double length;
  double breadth;
  double area;
  double perimeter;

   Rectangle(double length , double breadth){
    this.length = length;
    this.breadth = breadth;
   }

    void area(){
        area = length *breadth;
        System.out.println("The area of rectangle is : " + area);
    }

    void perimeter(){
        perimeter = 2*(length + breadth);
        System.out.println("The perimeter of rectangle is : " + perimeter);
    }

    
        

   
}

  