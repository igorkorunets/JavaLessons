/*
Project name: "���� ������. ����� Scanner"
21.10.2016
*/
import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("������� ���-������:");
    String string = s.nextLine();
    System.out.println("�� �����: " + string);
    Scanner a = new Scanner(System.in);
    System.out.println("������� �����-������ �����:");
    int x = a.nextInt();
    System.out.println("�� ����� �����: " + x);
  }
}
