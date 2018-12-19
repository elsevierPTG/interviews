package com.elsevier.education;

import org.junit.Assert;
import org.junit.Test;

import com.elsevier.education.Exercise5.Singleton;



public class Exercise5Test {

	@Test
	public void make_sure_instance_created_only_once() {

		Singleton st1 = Singleton.getInstance();
		st1.doSomeThing();
		
		Singleton st2 = Singleton.getInstance();
		st2.doSomeThing();
		
		Assert.assertTrue(st1 == st2);

	}
}
