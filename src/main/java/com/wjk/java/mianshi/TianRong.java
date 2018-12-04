package com.wjk.java.mianshi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class TianRong {

	@Test
	public void testListVO() {
		Table t1 = new Table("1", "A1", "B1");
		Table t2 = new Table("2", "A1", "B1");
		Table t3 = new Table("3", "A2", "B2");
		Table t4 = new Table("4", "A2", "B2");
		Table t5 = new Table("5", "A3", "B3");

		ArrayList<Table> list = new ArrayList<Table>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		
	}
}
