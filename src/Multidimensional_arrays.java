/*
Project name: "����������� �������"
23.10.2016
*/
public class Multidimensional_arrays {
  public static void main(String[] args) {
    int[] number = {1,2,3}; //���������� ������

    int [][] matrice = {{1,2,3,4,5},   //���������� ������ � ����� ����������� ���������:
                        {4},           //������ ������ - {1,2,3}, ������ ������ {4,5,6}, ������ ������ {7,8,9}
                        {7,8,9}};
    System.out.println(matrice[2][2]);  //������� ���������� ����� �� ������� (� ������ ������ �� ��������� �� �� ������ ������, ������ ������� "matrice[2][2]")
    System.out.println(matrice[1][0]);  //������ �� ����� ����� 4
    System.out.println(matrice[0][4]);  //������ �� ����� ����� 5

    String[][] strings = new String[2][3];  //������� ���������� ������ �������: 2 ������, 3 �������
    strings[0][1] = "������"; //�������������� � ������ �������, ������ �������
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
