/*
Project name: "Классы и объекты", "Тип возвращаемого значения метода", "Параметры метода"
23.10.2016, 26.10.2016, 26.10.2016
*/
public class ClassesAndObjects {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.setNameAndAge("Роман", 50);
    person1.sayHello();
    person1.speak();
    int year1 = person1.calculateYears();
    System.out.println("Количестов лет до пенсии: " + year1);

    System.out.println("___________________________");
    System.out.println();

    Person person2 = new Person();
    person2.name = "Вова";
    person2.age = 20;
    person1.sayHello();
    person2.speak();
    int year2 = person2.calculateYears();
    System.out.println("Количестов лет до пенсии: " + year2);
  }
}

class Person {
  //У класса могут быть:
  //1. Данные (поля)
  //2. Действия, которые он может совершать (методы)
  String name;
  int age;

  void setNameAndAge(String username, int userage) {
    name = username;
    age = userage;
  }

  int calculateYears() { //Подсчет оставшихся лет до пенсии
    int years = 65 - age;
    return years;
  }
  void speak() {
    System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
  }
  void sayHello() {
    System.out.println("Привет!");
  }
}
