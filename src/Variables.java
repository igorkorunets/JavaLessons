/*
Project name: "Переменные. Примитивные типы данных"
13.10.2016
*/
public class Variables {
  public static void main(String[] args) {
    int myInt = 557;  //Целочисленный тип данных, 32-битное число. Диапазон значений: от -2 147 483 648 до 2 147 483 647
    short myShort = 3266;  //Целочисленный тип данных, 16-битное число. Диапазон значений: от -32 768 до 32 767
    long myLong = 2472482; //Целочисленный тип данных, 64-битное число. 18 446 744 073 709 551 616 значений

    double myDouble = 235.35; //Вещественный тип данных, 64-битное число
    float myFloat = 2362.4f; //Вещественный тип данных, 32-битное число. В конце числа должен стоять символ f, т.к. по-умолчанию оно воспринимается как тип double

    char c = 'a'; //Целочисленный тип данных, которому можно присвоить как числа, так и символы, но числа на экран выводятся ввиде симолов по кодировке ascii(аски)
    boolean b = true; //Переменная, имеющая только два значения: Истина или Ложь (true & false)

    byte myByte = 100; //Целочисленный тип данных, 8-битное число. Диапазон значений: от -128 до 127

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
