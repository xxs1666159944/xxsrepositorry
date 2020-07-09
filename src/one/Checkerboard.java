package one;

import java.util.Random;

public class Checkerboard {
  private int row;
  private int column;
  private int nowGeneration; //ϸ�������Ĵ���
  private int [][] gird; //������0������ϸ����1�����ϸ��
  
  Checkerboard(int row1, int column1) {
    row = row1;
    column = column1;
    gird = new int[row + 2][column1 + 2];
    initi();
  }

  //����״̬�ĳ�ʼ������õ�һ��ϸ��
  public void initi() {
    nowGeneration = 1;
    for (int i = 0; i < row + 2; i++) {
      for (int j = 0; j < column + 2; j++) {
        gird[i][j] = 0;
      }
    }
    Random r = new Random();
    for (int i = 1; i < row + 1; i++) {
      for (int j = 1; j < column + 1; j++) {
        gird[i][j] = r.nextInt(2);
      }
    }
  }
	
  //ϸ�����ܹ���
  public void Transfer(){
    int [][]gird1 = new int[row + 2][column + 2];
    for (int i = 1; i < row + 1; i++) {
      for (int j = 1; j < column + 1; j++) {
        if (getNeighborCount(i, j) == 2) {
          gird1[i][j] = gird[i][j];
        } else if (getNeighborCount(i, j) == 3) {
          gird1[i][j] = 1;
        } else {
          gird1[i][j] = 0;
        }
      }
    }
    for (int i = 1; i < row + 1; i++) { 
      for (int j = 1; j < column + 1; j++) { 
        gird[i][j] = gird1[i][j];
      }
    }
      nowGeneration++;
    
  }
	
  //���һ��ϸ����Χ�Ļ�ϸ������
  public int getNeighborCount(int row1, int column1) {
    int count = 0;
    for (int i = row1 - 1; i < row1 + 2; i++) {
      for (int j = column1 - 1; j < column1 + 2; j++) {
        count = count + gird[i][j];
      }
    }
    count = count - gird[row1][column1];
    return count;
  }
  
  public void Show() {
    for (int i = 1; i < row + 1; i++) {
      for (int j = 1; j < column + 1; j++) {
        System.out.print(gird[i][j] + " ");
      }
      System.out.println();
    }
  }
  
  public void SetGird(int [][]gird) {
    this.gird = gird;
  }
  
  public int GetRow() {
    return row;
  }
  public int GetColumn() {
    return column;
  }
  public int [][] GetGird() {
    return gird;
  }
  public int GetNowGeneration() {
    return nowGeneration;
  }
}
