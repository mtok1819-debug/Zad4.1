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
    Scanner scanner = new Scanner(System.in);
    Service s = new Service();
    while (true) {
      System.out.println("1. Dodaj studenta");
      System.out.println("0. Wyjdz");
      System.out.print("Wybierz opcje: ");
      
      int choice = scanner.nextInt();
      scanner.nextLine();
      
      if (choice == 0) {
        System.out.println("Do widzenia!");
        break;
      }
    }
  }
}
