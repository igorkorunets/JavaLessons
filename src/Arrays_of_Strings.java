/*
Project name: "������� � Java"
21.10.2016
*/
public class Arrays_of_Strings {
  public static void main(String[] args) {
    int[] numbers = new int[5];
    numbers[0] = 10;
    String[] strings = new String[3];
    strings[0] = "������";
    strings[1] = "����";
    strings[2] = "�����";

    for(int i  = 0; i < strings.length; i++) {
      System.out.println(strings[i]);
    }
    System.out.println();
    for(String string:strings) {  //���� "For Each". �� ������ �������� ����� ������ "string" ���������� ��������� �� �������� ������� � ������� �� �� �����
      System.out.println(string);
    }
    System.out.println();
    int[] numbers1 = {1,2,3};
    int sum = 0;
    for(int x:numbers1) { //�� ������ �������� ����� ���������� "x" ��������� �� ������ ������� ������� "numbers1".
      sum = sum + x;      //����� �������� ���������� "x" ������������ � �������� ���������� "sum" � �.�.
    }
    System.out.println(sum);  //��������� ����� ��������� ������� "numbers1"
  }
}
