/*
Project name: "����������� �������"
23.10.2016
*/
public class Multidimensional_arrays {
  public static void main(String[] args) {
    int[] number = {1,2,3}; //���������� ������

    int [][] matrice = {{1,2,3},   //���������� ������ � ����� ����������:
                        {4,5,6},   //������ ������� - {1,2,3}, ������ ������� {4,5,6}, ������ ������� {7,8,9}
                        {7,8,9}};
    System.out.println(matrice[2][2]);  //������� ���������� ����� �� �������� ������� (� ������ ������ �� ��������� �� �� ������ ������, ������ ������� "matrice[2][2]")
    System.out.println(matrice[1][0]);  //������ �� ����� ����� 4
  }
}
