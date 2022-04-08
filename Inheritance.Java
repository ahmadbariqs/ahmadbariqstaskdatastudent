class Car {
}

class SUV extends Car {
}

class MPV extends Car {
}

public class Toyota extends SUV {

   public static void main(String args[]) {
      Car c = new Car();
      SUV s = new SUV();
      Toyota t = new Toyota();

      System.out.println(s instanceof Car);
      System.out.println(t instanceof SUV);
      System.out.println(t instanceof Car);
   }
}
