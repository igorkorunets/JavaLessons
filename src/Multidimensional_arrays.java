/*
Project name: "Многомерные массивы"
23.10.2016
*/
public class Multidimensional_arrays {
  public static void main(String[] args) {
    int[] number = {1,2,3}; //Одномерный массив

    int [][] matrice = {{1,2,3,4,5},   //Двухмерный массив с тремя одномерными массивами:
                        {4},           //первый массив - {1,2,3}, второй массив {4,5,6}, третий массив {7,8,9}
                        {7,8,9}};
    System.out.println(matrice[2][2]);  //Выводим конкретное число из массива (в данном случае мы ссылаемся на на третью строку, третий столбец "matrice[2][2]")
    System.out.println(matrice[1][0]);  //Выодим на экран число 4
    System.out.println(matrice[0][4]);  //Выодим на экран число 5

    String[][] strings = new String[2][3];  //Создаем двухмерный массив размера: 2 строки, 3 столбца
    strings[0][1] = "Привет"; //Инициализируем в первом массиве, второй элемент
    System.out.println(strings[0][1]);

    int[][] matrice1 = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
    for(int i = 0; i < matrice1.length; i++) {
      for(int j = 0; j < matrice1[i].length; j++) {
        System.out.print(matrice1 [i][j] + " ");
      }
      System.out.println();
    }
  }
}
