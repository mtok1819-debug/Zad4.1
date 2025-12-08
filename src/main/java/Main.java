/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.util.Collection;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Service service = new Service();
    
    while (true) {
      System.out.println("1. Dodaj studenta");
      System.out.println("2. Wypisz wszystkich studentow");
      System.out.println("0. Wyjdz z aplikacji");
      System.out.print("Wybierz opcje: ");
      
      int choice = sc.nextInt();
      sc.nextLine();
      
      switch (choice) {
        case 1:
          System.out.println("Dodaj studenta");
          System.out.print("Podaj imie: ");
          String name = sc.nextLine();
          System.out.print("Podaj wiek: ");
          int age = sc.nextInt();
          sc.nextLine();
          Student student = new Student(name, age);
          try {
            service.addStudent(student);
            System.out.println("Student dodany pomyslnie!");
          } catch (IOException e) {
            System.out.println("Blad podczas dodawania studenta: " + e.getMessage());
          }
          break;
        case 2:
          System.out.println("Lista studentow:");
          try {
            Collection<Student> students = service.getStudents();
            for (Student current : students) {
              System.out.println(current.ToString());
            }
          } catch (IOException e) {
            System.out.println("Blad podczas odczytu: " + e.getMessage());
          }
          break;
        case 0:
          System.out.println("Do widzenia!");
          sc.close();
          return;
        default:
          System.out.println("Nieprawidlowa opcja, sprobuj ponownie.");
      }
      System.out.println();
    }
  }
}
