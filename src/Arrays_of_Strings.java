/*
Project name: "Массивы в Java"
21.10.2016
*/
public class Arrays_of_Strings {
  public static void main(String[] args) {
    int[] numbers = new int[5];
    numbers[0] = 10;
    String[] strings = new String[3];
    strings[0] = "Привет";
    strings[1] = "Пока";
    strings[2] = "Джава";

    for(int i  = 0; i < strings.length; i++) {
      System.out.println(strings[i]);
    }
    System.out.println();
    for(String string:strings) {  //Цикл "For Each". На каждой итерации цикла строка "string" поочередно ссылается на элементы массива и выводит их на экран
      System.out.println(string);
    }
  }
}
