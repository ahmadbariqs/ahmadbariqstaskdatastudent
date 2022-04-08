class Car {
   public void move() {
      System.out.println("Car can move");
   }
}

class Toyota extends Car {
   public void move() {
      System.out.println("Toyota cars can move");
   }
}

public class TestToyota {

   public static void main(String args[]) {
      Car a = new Car();   
      Car b = new Toyota();   

      a.move(); 
      b.move();  
   }
}
