/*
Project name: "����������. ����������� ���� ������"
13.10.2016
*/
public class Variables {
  public static void main(String[] args) {
    int myInt = 557;  //������������� ��� ������, 32-������ �����. �������� ��������: �� -2 147 483 648 �� 2 147 483 647
    short myShort = 3266;  //������������� ��� ������, 16-������ �����. �������� ��������: �� -32 768 �� 32 767
    long myLong = 2472482; //������������� ��� ������, 64-������ �����. 18 446 744 073 709 551 616 ��������

    double myDouble = 235.35; //������������ ��� ������, 64-������ �����
    float myFloat = 2362.4f; //������������ ��� ������, 32-������ �����. � ����� ����� ������ ������ ������ f, �.�. ��-��������� ��� �������������� ��� ��� double

    char c = 'a'; //������������� ��� ������, �������� ����� ��������� ��� �����, ��� � �������, �� ����� �� ����� ��������� ����� ������� �� ��������� ascii(����)
    boolean b = true; //����������, ������� ������ ��� ��������: ������ ��� ���� (true & false)

    byte myByte = 100; //������������� ��� ������, 8-������ �����. �������� ��������: �� -128 �� 127

    System.out.println(myInt);
    System.out.println(myShort);
    System.out.println(myLong);
    System.out.println(myDouble);
    System.out.println(myFloat);
    System.out.println(c);
    System.out.println(b);
    System.out.println(myByte);
  }
}
