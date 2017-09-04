package jianzhiofffer.other;
/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author lliukunsheng
 *
 */
import java.util.*;
public class Main {
	
	public static void main(String [] args) {
		
		
		int [][] matrix= new int[5][1];
		matrix[0][0]=1;
		matrix[1][0]=2;
		matrix[2][0]=3;
		matrix[3][0]=4;
		matrix[4][0]=5;
		
		ArrayList<Integer> list = printMatrix(matrix);
		
		System.out.println(list);
	}
	
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
    	int xStart=0;
    	int xEnd=matrix[0].length-1;
    	int yStart=0;
    	int yEnd=matrix.length-1;
    	ArrayList<Integer> list = new ArrayList<>();
    	while(xStart<=xEnd&&yStart<=yEnd) {
    		dowork(list,matrix,xStart,xEnd,yStart,yEnd);
    		xStart++;
    		xEnd--;
    		yStart++;
    		yEnd--;
    	}
    	return list;	
    }
    
    public static void dowork(ArrayList<Integer> list,int [][] matrix,int xStart,
    		int xEnd ,int yStart,int yEnd) {
    	
    	for(int i=xStart;i<=xEnd;i++) {
    		list.add(matrix[yStart][i]);
    	}
    	for(int i=yStart+1;i<=yEnd;i++) {
    		list.add(matrix[i][xEnd]);
    	}
    	if(yStart<yEnd) {
    	for(int i=xEnd-1;i>=xStart;i--) {
    		list.add(matrix[yEnd][i]);
    	}
    	}
    	if(xStart<xEnd) {
    	for(int i=yEnd-1;i>=yStart+1;i--) {
    		list.add(matrix[i][xStart]);
    	}
    	}
    }
	
}
