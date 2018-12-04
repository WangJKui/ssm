package com.wjk.java.base;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class TestListSet {

	@Test
	public void testListAndSet() {
		List<String> updatedCodes = new ArrayList<>();
		updatedCodes.add("mtime");
		updatedCodes.add("mtime");
		updatedCodes.add("muid");
		updatedCodes.add("muname");
		updatedCodes.add("muoid");
		updatedCodes.add("muoname");
		
		//流程表单包含十个字段
		updatedCodes = new ArrayList<String>(new HashSet<String>(updatedCodes)); 
		
		System.out.println(updatedCodes.toString());
	}
}
