class Car {
  public void carSound() {
    System.out.println("The Car makes a sound");
  }
}

class Honda extends Car {
  public void carSound() {
    System.out.println("The Honda horn: tin tin tin");
  }
}

class Toyota extends Car {
  public void carSound() {
    System.out.println("The Toyota horn: ton ton");
  }
}

class Main {
  public static void main(String[] args) {
    Car myCar = new Car();
    Car myHonda = new Honda();
    Car myToyota = new Toyota();
        
    myCar.carSound();
    myHonda.carSound();
    myToyota.carSound();
  }
}
