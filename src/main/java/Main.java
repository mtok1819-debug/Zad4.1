/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
  System.out.println("Wybierz opcje: 1. Dodaj studenta, 2.Wypisz studentów, 0. Wyjscie");
     Scanner scanner = new Scanner(System.in);
    Service s = new Service();
    int option = scanner.nextInt();
    scanner.nextLine();
    switch(option) {
      case 1:
          try{
            System.out.println("Podaj imie studenta");
            String name = scanner.nextLine();
            System.out.println("Podaj wiek studenta");
            int age = scanner.nextInt();
            scanner.nextLine();
            s.addStudent(new Student(name, age));
            
          }
          catch(IOException e){
            System.out.println("Wystapil blad");
          }
          break;
          case 2:
            try{
              java.util.Collection<Student> students = s.getStudents();
              for(Student current : students) {
                System.out.println(current.ToString());
              }
            } catch(IOException e){
              System.out.println("Wystapil blad");
            }
            break;
            
          case 0:
            System.out.println("Wyjscie");
            break;
    }
    }
    
}