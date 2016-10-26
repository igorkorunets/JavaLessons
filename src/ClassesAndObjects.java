/*
Project name: "������ � �������", "��� ������������� �������� ������", "��������� ������"
23.10.2016, 26.10.2016, 26.10.2016
*/
public class ClassesAndObjects {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.setNameAndAge("�����", 50);
    person1.sayHello();
    person1.speak();
    int year1 = person1.calculateYears();
    System.out.println("���������� ��� �� ������: " + year1);

    System.out.println("___________________________");
    System.out.println();

    Person person2 = new Person();
    person2.name = "����";
    person2.age = 20;
    person1.sayHello();
    person2.speak();
    int year2 = person2.calculateYears();
    System.out.println("���������� ��� �� ������: " + year2);
  }
}

class Person {
  //� ������ ����� ����:
  //1. ������ (����)
  //2. ��������, ������� �� ����� ��������� (������)
  String name;
  int age;

  void setNameAndAge(String username, int userage) {
    name = username;
    age = userage;
  }

  int calculateYears() { //������� ���������� ��� �� ������
    int years = 65 - age;
    return years;
  }
  void speak() {
    System.out.println("���� ����� " + name + ", ��� " + age + " ���.");
  }
  void sayHello() {
    System.out.println("������!");
  }
}
