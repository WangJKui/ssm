package com.wjk.test;

import org.junit.Test;

class Tank {
	int level;
}


class Letter{
	char c;
}

public class Assignment {

	//========================测试string============================
	private static String a = new String("ab");  

	//当调用 intern 方法时，如果池已经包含一个等于此 String 对象的字符串
	//（该对象由 equals(Object) 方法确定），则返回池中的字符串。
	//否则，将此 String 对象添加到池中，并且返回此 String 对象的引用。 
	//它遵循对于任何两个字符串 s 和 t，当且仅当 s.equals(t) 为 true 时，
	//s.intern() == t.intern() 才为 true。 
	public static void testEquals() {  
		String s1 = "a";  
		String s2 = "b";  
		String s = s1 + s2;  
		System.out.println(s == a);  //false
		System.out.println(s.intern() == a);  //false
		System.out.println(s.intern() == a.intern());  //true
		System.out.println("-----------------------------------");
		System.out.println(s.equals(a));  //true
		System.out.println(s.intern().equals(a));  //true
		System.out.println(s.intern() .equals(a.intern())); //true
	}  

	public static void testStringAB(String s) {
		s = new String("C");//堆中对象
		//s = "C"; 常量池中
		//“C在堆中” 栈中 s 指向 C，本来s指向A，strA指向A ，s是strA是拷贝
		//所以没有修改strA的指向，也就没有修改strA的值
	}


	public static void testString() {
		String strA = new String("A");
		String strB = new String("B");

		System.out.println("strA="+strA);
		System.out.println("strB="+strB);

		System.out.println("-----------------------------------");
		testStringAB(strA);
		System.out.println("strA="+strA);//strA=A
		System.out.println("strB="+strB);//strB=B

	}



	//================测试对象===============================
	public static void f(Letter y) {
		y.c = 'f';
	}

	public static void z(char y) {
		y = 'z';
	}

	public static void testLetter() {
		Letter x = new Letter();

		x.c = 'a' ;
		System.out.println("x.c="+x.c);
		//x.c=a

		f(x);
		System.out.println("x.c="+x.c);
		//x.c=f

		z(x.c);
		System.out.println("x.c="+x.c);
		//x.c=f
	}

	//=============================================
	public static void testTank() {
		Tank t1 = new Tank();
		Tank t2 = new Tank();

		t1.level = 9;
		t2.level = 47;
		System.out.println("t1.level="+t1.level+",t2.level="+t2.level);
		//t1.level=9,t2.level=47

		t1=t2;
		System.out.println("t1.level="+t1.level+",t2.level="+t2.level);
		//t1.level=47,t2.level=47

		t1.level = 27;
		//修改的事堆内存中的对象 t1,t2都是堆内存中对象的引用，
		//之前一直以为修改的事栈内存中对象的引用
		System.out.println("t1.level="+t1.level+",t2.level="+t2.level);
		//t1.level=27,t2.level=27
		/**
		 * t1.level=9,t2.level=47
			t1.level=47,t2.level=47
			t1.level=27,t2.level=27
		 */
	}

	public static void main(String[] args) {
		testTank();
		testLetter();
		testString();
		testEquals();
		testModel();
	}

	//================================================================

	

	public static void changeInt(int i) {// 改变int型变量的函数
		i = 100;
	}

	public static void changeString(String s) {// 改变String型变量的函数
		s = "changeString";
		//“changeString在常量池中” 栈中 s 指向changeString，
		//本来s指向hello，str指向hello ，s是str是拷贝
		//所以没有修改strA的指向，也就没有修改strA的值
	}

	public static void changeModel(Model model) {// 改变Model型变量的函数
		model = new Model();
		model.i = 1;
		model.s = "changeModel";
		//model是model1的拷贝，指向model1的堆中对象
		//但是model又重新指向堆中新的对象，所以model1没有改变
	}

	public static void changeModel2(Model model) {// 改变Model型变量的成员的函数
		model.i = 1;
		model.s = "changeModel";
		//model和model1都指向同一个对象
	}

	// 类Model

	// 测试程序
	public static void testModel() {
		System.out.println("==================================================");

		int i = 0;
		String str = "hello";
		Model model1 = new Model();
		Model model2 = new Model();

		changeInt(i);
		System.out.println("i=" + i);
		changeString(str);
		System.out.println("str=" + str);
		changeModel(model1);
		System.out.println("model:" + model1.s);
		changeModel2(model2);
		System.out.println("model2:" + model2.s);

	}
}

class Model {
	public int i = 0;
	public String s = "no value";
}
