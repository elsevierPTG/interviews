package com.elsevier.education;

import static org.junit.Assert.*;

import org.junit.Test;

import com.elsevier.education.Exercise4.ThreadCounter;

public class Exercise4Test {
	/**
	 * Note: Think about how to do an assert for this.
	 */
	@Test
	public void test() {
		Exercise4 ex4 = new Exercise4();
		
		
    	ThreadCounter threadOne = ex4.new ThreadCounter("1");
    	ThreadCounter threadTwo = ex4.new ThreadCounter("2");
    	ThreadCounter threadThree = ex4.new ThreadCounter("3");

        threadOne.start();
        threadTwo.start();
        threadThree.start();
	}

}
