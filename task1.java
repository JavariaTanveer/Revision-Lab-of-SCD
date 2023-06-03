import java.util.Scanner;
interface VehicleSpec {
  void displaySpec();
}


abstract class Vehicle implements VehicleSpec {
  String name;
  String model;
  int year;

  Vehicle(String name, String model, int year) {
    this.name = name;
    this.model = model;
    this.year = year;
  }

  public void display() {
    System.out.println("Name: " + name);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
  }
}

class Car extends Vehicle {
  
  Car(String name, String model, int year) {
    super(name, model, year);
  }
  public void displaySpec() {
    System.out.println("----Car-----.");
  }
}

class Motorcycle extends Vehicle {
  
  Motorcycle(String name, String model, int year) {
    super(name, model, year);
  }

  public void displaySpec() {
    System.out.println("----Motorcycle-----");
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter car make:");
    String carName = scanner.nextLine();

    System.out.println("Enter car model:");
    String carModel = scanner.nextLine();

    System.out.println("Enter car year:");
    int carYear = scanner.nextInt();
    scanner.nextLine(); 

    
    Car car = new Car(carName, carModel, carYear);
    car.displaySpec();
    car.display();
   
    System.out.println("Enter motorcycle make:");
    String motoName = scanner.nextLine();

    System.out.println("Enter motorcycle model:");
    String motoModel = scanner.nextLine();

    System.out.println("Enter motorcycle year:");
    int motoYear = scanner.nextInt();
    scanner.nextLine(); 
    
    Motorcycle motorcycle = new Motorcycle(motoName, motoModel, motoYear);
    motorcycle.displaySpec();
    motorcycle.display();
   
  }
}