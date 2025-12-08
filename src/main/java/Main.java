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
    Scanner sc=new Scanner(System.in);
      while(true){
       System.out.println("1.Dodaj studenta:");
      System.out.println("0.Wypisz z aplikacji:");
      
    

    switch;
        {
      case 1:
        System.out.println("Dodaj studenta");
        System.out.println("Podaj imie:");
        String name=sc.nextLine();
        System.out.println("Podaj wiek:");
        int age=sc.nextInt();
        Student student=new Student(name,age);
        Service service=new Service();
        service.addStudent(student);
        break;
      case 0:
        System.out.println("Wypisuje z aplikacji");
        break;
      
    }
    }
    try {
      Service s = new Service();
      s.addStudent(new Student("Krzysztof", 20));
      s.addStudent(new Student("Janusz", 40));

      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) {
      
    }
  }
}