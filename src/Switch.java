/*
Project name: "Оператор Switch"
21.10.2016
*/
import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите Ваш возраст:");
    int age = scanner.nextInt();
    switch(age) {
      case 0: System.out.println("Ты родился!"); break;
      case 7: System.out.println("Ты пошел в школу!"); break;
      case 18: System.out.println("Ты закончил школу!"); break;

      default: System.out.println("Ни одно из предыдущих значений не подошло!");
    }
  }
}
