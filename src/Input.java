/*
Project name: "Ввод данных. Класс Scanner"
21.10.2016
*/
import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Введите что-нибудь:");
    String string = s.nextLine();
    System.out.println("Вы ввели: " + string);
    Scanner a = new Scanner(System.in);
    System.out.println("Введите какое-нибудь число:");
    int x = a.nextInt();
    System.out.println("Вы ввели число: " + x);
  }
}
