/*
Project name: "Цикл DoWhile"
21.10.2016
*/
import java.util.Scanner;

public class Dowhile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите 5:");
    int value = scanner.nextInt();
    while(value != 5) { //Проверяется условие ввода, если оно верно, то цикл выполняется
      System.out.println("Введите 5:");
      value = scanner.nextInt();
    }
    System.out.println("Ура! Вы ввели 5!");
  }
}
