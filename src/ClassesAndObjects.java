/*
Project name: "������ � �������"
23.10.2016
*/
public class ClassesAndObjects {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "�����";
    person1.age = 50;
    System.out.println("���� ����� " + person1.name + ", " + "��� " + person1.age + " ���.");
    Person person2 = new Person();
    person2.name = "����";
    person2.age = 20;
    System.out.println("���� ����� " + person2.name + ", " + "��� " + person2.age + " ���.");
  }
}

class Person {
  //� ������ ����� ����:
  //1. ������ (����)
  //2. ��������, ������� �� ����� ��������� (������)
  String name;
  int age;
}
