package com.deepak.ctci.Ch01_Arrays_And_Strings;

public class Problem_08 {

	public static int[][] setZeros(int[][] matrix) {
		// TODO Auto-generated method stub
		Problem_08 p = new Problem_08();
		int[][] newMat = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < newMat.length; i++) {
			for (int j = 0; j < newMat[0].length; j++) {
				if (matrix[i][j] == 0) {
					newMat = p.destroy(newMat, i, j);
				}
				else {
					newMat[i][j] = matrix[i][j];
				}
			}
		}
		return newMat;
	}

	public int[][] destroy(int[][] matrix, int i, int j) {
		for (int m = 0; m < matrix.length; m++) {
			for (int k = 0; k < matrix[0].length; k++) {
				if (m == i) {
					matrix[m][k] = 0;
				}
				if (k == j)
					matrix[m][k] = 0;
			}
		}
		return matrix;

	}

}
