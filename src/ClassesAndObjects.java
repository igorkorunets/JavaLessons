/*
Project name: "������ � �������"
23.10.2016, 26.10.2016
*/
public class ClassesAndObjects {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "�����";
    person1.age = 50;
    person1.sayHello();
    person1.speak();
    person1.calculateYears();

    System.out.println("___________________________");
    System.out.println();

    Person person2 = new Person();
    person2.name = "����";
    person2.age = 20;
    person1.sayHello();
    person2.speak();
    person2.calculateYears();
  }
}

class Person {
  //� ������ ����� ����:
  //1. ������ (����)
  //2. ��������, ������� �� ����� ��������� (������)
  String name;
  int age;

  void calculateYears() { //������� ���������� ��� �� ������
    int years = 65 - age;
    System.out.println("���������� ��� �� ������: " + years);
  }
  void speak() {
    System.out.println("���� ����� " + name + ", ��� " + age + " ���.");
  }
  void sayHello() {
    System.out.println("������!");
  }
}
