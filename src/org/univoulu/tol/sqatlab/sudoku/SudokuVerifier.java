package org.univoulu.tol.sqatlab.sudoku;

import java.util.Arrays;

import com.sun.xml.internal.ws.util.StringUtils;

public class SudokuVerifier {
 
	char[] validRow = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
	
	public int verify(String candidateSolution) {
		
		char[] firstRow = candidateSolution.substring(0, 9).toCharArray();
		Arrays.sort(firstRow);
		
		char[] secondRow = candidateSolution.substring(9, 18).toCharArray();
		Arrays.sort(secondRow);
		
		if(checkIfRowContainsDuplicates(firstRow)){
			return -3;
		}else if (!Arrays.equals(firstRow, secondRow)){
			return -3;
			}
		else{
			return 0;
		}
	}

	private boolean checkIfRowContainsDuplicates(char[] firstRow) {
		return !Arrays.equals(firstRow, validRow);
	}
}