/*
Project name: "Условный оператор if"
21.10.2016
*/
public class If {
  public static void main(String[] args) {
    int myInt = 15;
    if(myInt < 10) {
      System.out.println("Да, верно!");
    } else if(myInt > 20) {
      System.out.println("Так тоже верно!");
    } else {
      System.out.println("Ни один из предыдущих случаев");
    }
  }
}
