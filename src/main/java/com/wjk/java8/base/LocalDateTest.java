package com.wjk.java8.base;

import java.time.LocalDate;
import java.time.YearMonth;

import org.junit.Test;

public class LocalDateTest {

	@Test
	public void testLocalDate() {
		
//		LocalDate localDate = LocalDate.parse("2017-12-07");
//		
//		int mon = localDate.getMonthValue();
//		
//		System.out.println(mon);
//		
//		System.out.println(localDate.getDayOfMonth());
//
//		
//		localDate = localDate.plusMonths(1);
//		
//		System.out.println(localDate.getMonthValue());
//		System.out.println(localDate.getYear());
//
//		System.out.println(localDate.toString());
//		System.out.println(localDate.getMonth().toString());
//
//		YearMonth ym = YearMonth.of(localDate.getYear(), localDate.getMonthValue());
//		
//		System.out.println(ym.toString());
//		
		LocalDate ld = LocalDate.parse("2017-12-07");
		
		YearMonth yearMonth = YearMonth.of(ld.getYear(), ld.getMonthValue());
		
		//返回当月期次
		if(23 >= ld.getDayOfMonth()) {
			System.out.println("++++++++++"+yearMonth.toString());
		}else {
			//月份加1
			ld = ld.plusMonths(1);
			yearMonth = YearMonth.of(ld.getYear(), ld.getMonthValue());
			System.out.println("======"+yearMonth.toString());
		}
		
			try {
				System.out.println(testEx());
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

	private int testEx() throws Exception{
		return 2;
	}
}
