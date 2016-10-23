/*
Project name: "������ � �������"
23.10.2016
*/
public class ClassesAndObjects {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "�����";
    person1.age = 50;
    person1.speak();
    person1.sayHello();
    Person person2 = new Person();
    person2.name = "����";
    person2.age = 20;
    person2.speak();
  }
}

class Person {
  //� ������ ����� ����:
  //1. ������ (����)
  //2. ��������, ������� �� ����� ��������� (������)
  String name;
  int age;

  void speak() {
    System.out.println("���� ����� " + name + ", ��� " + age + " ���.");
  }
  void sayHello() {
    System.out.println("������!");
  }
}
