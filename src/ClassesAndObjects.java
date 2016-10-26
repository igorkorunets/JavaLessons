/*
Project name: "Классы и объекты"
23.10.2016, 26.10.2016
*/
public class ClassesAndObjects {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Роман";
    person1.age = 50;
    person1.sayHello();
    person1.speak();
    person1.calculateYears();

    System.out.println("___________________________");
    System.out.println();

    Person person2 = new Person();
    person2.name = "Вова";
    person2.age = 20;
    person1.sayHello();
    person2.speak();
    person2.calculateYears();
  }
}

class Person {
  //У класса могут быть:
  //1. Данные (поля)
  //2. Действия, которые он может совершать (методы)
  String name;
  int age;

  void calculateYears() { //Подсчет оставшихся лет до пенсии
    int years = 65 - age;
    System.out.println("Количестов лет до пенсии: " + years);
  }
  void speak() {
    System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
  }
  void sayHello() {
    System.out.println("Привет!");
  }
}
