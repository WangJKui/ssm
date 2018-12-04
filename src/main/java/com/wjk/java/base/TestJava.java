package com.wjk.java.base;

import org.junit.Test;

public class TestJava {

	public static void testArray() {
		Integer[] arrayInteger = new Integer[2];
		for (Integer integer : arrayInteger) {
			System.out.println(integer);
		}
		System.out.println("------------------------------------------");
		int [] arrayInt = new int[2];
		for (int i : arrayInt) {
			System.out.println(i);
		}
		
		System.out.println("------------------------------------------");
		double  [] arrayDouble = new double[2];
		for (double d : arrayDouble) {
			System.out.println(d);

		}
		
		System.out.println("------------------------------------------");
		Double  [] arrayDdouble = new Double[2];
		for (Double dd : arrayDdouble) {
			System.out.println(dd);
		}
		
		System.out.println("------------------------------------------");
		String  [] arrayString = new String[2];
		for (String s : arrayString) {
			System.out.println(s);
		}
		
		System.out.println("------------------------------------------");
		String  [] ss = {"",""};
		for (String s : ss) {
			System.out.println("ss="+s+"..");
		}
		
		System.out.println("------------------------------------------");
		char  [] arrayChar = new char[2];
		for (char c : arrayChar) {
			System.out.println("char="+c+".空格");
		}
		
		
		System.out.println("============================================");
		 // byte  
		byte b = 0;
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("默认值："+b);  
        System.out.println("包装类：java.lang.Byte");  
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
        System.out.println();  
  
        // short  
        short s = 0;
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);  
        System.out.println("默认值："+s);  
        System.out.println("包装类：java.lang.Short");  
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);  
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);  
        System.out.println();  
  
        // int  
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);  
        System.out.println("包装类：java.lang.Integer");  
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
        System.out.println();  
  
        // long  
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);  
        System.out.println("包装类：java.lang.Long");  
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  
  
        // float  
        float f = 0;
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);  
        System.out.println("默认值："+f);  
        System.out.println("包装类：java.lang.Float");  
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);  
        System.out.println();  
  
        // double  
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);  
        System.out.println("包装类：java.lang.Double");  
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);  
        System.out.println();  
  
        // char  
        char c = 0;
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);  
        System.out.println("默认值："+c);  
        System.out.println("包装类：java.lang.Character");  
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台  
        System.out.println("最小值：Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台  
        System.out.println("最大值：Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);  
	}
	
	public static void main(String[] args) {
		testArray();
	}
	
	@Test
	public void testIntInt() {
		Integer a = new Integer(3);
        Integer b = 3;                  // 将3自动装箱成Integer类型
        int c = 3;
        System.out.println(a == b);     // false 两个引用没有引用同一对象
        System.out.println(a == c);     // true a自动拆箱成int类型再和c比较
        System.out.println(b == c);     // true b自动拆箱成int类型再和c比较
        
        System.out.println("==============================");   
        Integer n1 = -129;
        Integer n2 = -129;
        Integer n3 = new Integer(10);
        Integer n4 = 10;
        System.out.println(n1.equals(n2));
        System.out.println(n1==n2);
        
        System.out.println(n3==n4);
        System.out.println(n3.equals(n4));
        
        Integer n5 = -127;
        Integer n6 = -127;//int 127 到 -128会放内存
        System.out.println("==============================");   
        System.out.println(n5==n6);
	}
	
	@Test
	public void testStringIn() {
		String s1 = "Programming";
		String s2 = new String("Programming");
		String s3 = "Program" + "ming";
		System.out.println(s1 == s2);//false
		System.out.println(s1 == s3);//true
		System.out.println(s1 == s1.intern());//true
	}
}
