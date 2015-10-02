package org.univoulu.tol.sqatlab.sudoku;

import java.util.Arrays;

import com.sun.xml.internal.ws.util.StringUtils;

public class SudokuVerifier {
 
	char[] validRow = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
	
	public int verify(String candidateSolution) {
		
		char[] firstRow = candidateSolution.substring(0, 8).toCharArray();
		Arrays.sort(firstRow);
		
		if(!Arrays.equals(firstRow, validRow)){
			return -3;
		}else return 0;
	}
}
