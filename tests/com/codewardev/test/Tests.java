package com.codewardev.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.codewardev.Isogram;

class Tests {

	 @Test
	    public void FixedTests() {
	        assertEquals(true, Isogram.isIsogram("Dermatoglyphics"));
	        assertEquals(true, Isogram.isIsogram("isogram"));
	        assertEquals(false, Isogram.isIsogram("moose"));
	        assertEquals(false, Isogram.isIsogram("isIsogram"));
	        assertEquals(false, Isogram.isIsogram("aba"));
	        assertEquals(false, Isogram.isIsogram("moOse"));
	        assertEquals(true, Isogram.isIsogram("thumbscrewjapingly"));
	        assertEquals(true, Isogram.isIsogram("")); 
	    }

}
