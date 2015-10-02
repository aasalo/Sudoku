package org.univoulu.tol.sqatlab.sudoku;

import java.util.Arrays;

import com.sun.xml.internal.ws.util.StringUtils;

public class SudokuVerifier {
 
	
	
	public int verify(String candidateSolution) {
		
		char[] firstRow = candidateSolution.substring(0, 9).toCharArray();
		Arrays.sort(firstRow);
		
		char[] secondRow = candidateSolution.substring(9, 18).toCharArray();
		Arrays.sort(secondRow);
		
		for(int i = 0; i <= 72; i = i+9){
			if(checkIfRowContainsDuplicates(candidateSolution.substring(i, i+9).toCharArray())){

				return -3;
			}
		}
		return 0;
	}
	

	private boolean checkIfRowContainsDuplicates(char[] row) {
		char[] validRow = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		return !Arrays.equals(row, validRow);
	}
}