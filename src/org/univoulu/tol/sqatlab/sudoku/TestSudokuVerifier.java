package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;

public class TestSudokuVerifier {

	@Parameter
	String firstRow = "417369825";
	
	@Test
	public void testFirstRow() {
		assertEquals(firstRow, "417369825");
	}
	
	@Test
	public void testSecondRowWithFirstRow() {
		fail("");
	}

}
