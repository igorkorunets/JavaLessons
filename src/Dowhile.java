/*
Project name: "Цикл DoWhile"
21.10.2016
*/
import java.util.Scanner;

public class Dowhile {
  public static void main(String[] args) {
    /*
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите 5:");
    int value = scanner.nextInt();
    while(value != 5) { //Проверяется условие ввода, если оно верно, то цикл выполняется
      System.out.println("Введите 5:");
      value = scanner.nextInt();
    }
    System.out.println("Ура! Вы ввели 5!"); //В данной программе присутствует дублирование кода, что нехорошо с точки зрения правильного синтаксиса
    */
    Scanner scanner = new Scanner(System.in);
    int value;
    do {
      System.out.println("Введите 5:");
      value = scanner.nextInt();
    } while(value != 5);
    System.out.println("Ура! Вы ввели 5!");
  }
}
