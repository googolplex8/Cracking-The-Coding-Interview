package com.deepak.ctci.Ch01_Arrays_And_Strings;

public class Problem_07 {

	public static int[][] rotateMatrix(int[][] matrix) {
		// TODO Auto-generated method stub
		int[][] newMat = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				newMat[matrix.length-i-1][j]=matrix[j][i];
			}
		}
		return newMat;
	}

	public static int[][] rotateMatrixInPlace(int[][] matrix) {
		// TODO Auto-generated method stub
		return null;
	}

}
