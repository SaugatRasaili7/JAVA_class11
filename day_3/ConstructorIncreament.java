// 6. Write a class with a constructor that increments a static counter each time an object is created
public class ConstructorIncreament {        

    static int counter = 0;

    ConstructorIncreament(){  
        counter++;  
    }
    void display(){  
        System.out.println("value: " + counter);  
    }

    public static void main(String[] args) {
        ConstructorIncreament obj1 = new ConstructorIncreament();
        ConstructorIncreament obj2 = new ConstructorIncreament();
        ConstructorIncreament obj3 = new ConstructorIncreament();

        obj3.display();
    }
}