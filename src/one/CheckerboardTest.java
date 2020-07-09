package one;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

public class CheckerboardTest {

	private  Checkerboard checkerboard=new Checkerboard(100,100);
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testCheckerboard() {
		int flag=0;
		int row=checkerboard.GetGird().length;
		int column=checkerboard.GetGird()[0].length;
		int test[][]=new int[row][column];
		test=checkerboard.GetGird();
		for(int i=0;i<column;i++)
			if(test[0][i]==0&&test[row-1][i]==0)
				flag=1;
			else {flag=0;break;}
		for(int i=0;i<row;i++)
			if(test[i][0]==0&&test[i][column-1]==0&&flag==1)
				flag=1;
			else {flag=0;break;}
		assertEquals(1,flag);
			
	}

	@Test
	public void testTransfer() {
		Checkerboard checkerboard=new Checkerboard(5, 5);
    	int gird [][]=new int [7][7];
    	int girdAfter [][]=new int [7][7];
    	for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				gird[i][j]=0;
				girdAfter[i][j]=0;
			}
		}
    	for(int i=1;i<6;i++) {
			for(int j=1;j<6;j++) {
				if(i%2==1&&j%2==1||i%2==0&&j%2==0)
					gird[i][j]=1;
				else gird[i][j]=0;
			}
		}
    	for(int i=2;i<5;i++) {
    		girdAfter[1][i]=1;
    		girdAfter[5][i]=1;
    		girdAfter[i][1]=1;
    		girdAfter[i][5]=1;
    	}
    	checkerboard.SetGird(gird);
    	checkerboard.Transfer();
    	assertEquals(true, Arrays.deepEquals(gird, girdAfter));

	}

	@Test
	public void testGetNeighborCount() {
		Checkerboard checkerboard=new Checkerboard(5, 5);
    	int gird [][]=new int [7][7];
    	for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				gird[i][j]=0;
			}
		}
    	for(int i=1;i<6;i++) {
			for(int j=1;j<6;j++) {
				if(i%2==1&&j%2==1||i%2==0&&j%2==0)
					gird[i][j]=1;
				else gird[i][j]=0;
			}
		}
    	checkerboard.SetGird(gird);
    	assertEquals(3,checkerboard.getNeighborCount(1, 2));
    	assertEquals(4,checkerboard.getNeighborCount(2, 2));
	}

}
