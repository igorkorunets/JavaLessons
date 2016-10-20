/*
Project name: "Строки. Ссылочные типы данных"
20.10.2016
*/
public class Strings {
  public static void main(String[] args) {
    int x = 5;  //Тип данных, хранящий в себе значения
    String s = "Hello"; //Тип данных, ссылающийся на объект класса String, поэтому пишется с большой буквы. В отличии от примитивных типов(int и др.)
    String space = " ";
    String name = "Bob";

    System.out.println(s + space + name);
    System.out.println("Hello" + " " + "Bob");
    System.out.println("My number is " + x);
  }
}
