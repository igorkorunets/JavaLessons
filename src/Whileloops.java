/*
Project name: "Цикл While"
14.10.2016
*/
public class Whileloops {
  public static void main(String[] args) {
    int value = 0;
    boolean a = true;
    boolean b = 5 > 2;
    boolean c = 5 > 7;
    boolean d = 5 >= 5;
    boolean e = 5 == 1;
    boolean f = value > 5;
    while(value < 5) {
      System.out.println("Hello " + value);
      value++;
    }

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
  }
}
