package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;

public class TestSudokuVerifier {

	SudokuVerifier verifier = new SudokuVerifier();
	
	@Parameter
	
	
	@Test
	public void testFirstRow() {
		verifier.verify(candidateSolution);
	}


}
