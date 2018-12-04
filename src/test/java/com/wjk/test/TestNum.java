package com.wjk.test;

import org.junit.Test;

public class TestNum {

	@Test
	public void testNumInt1(){
		int i = 1;
        System.out.println("i = " + i);//i = 1
        System.out.println("++i = " + ++i);//++i = 2 先执行运算，再生成值
        System.out.println("i++ = " + i++);//i++ = 2 先 生成值，再执行运算
        System.out.println("i = " + i);//i = 3

        System.out.println("--i = " + --i);//--i = 2 先执行运算，再生成值
        System.out.println("i-- = " + i--);//i-- = 2 先 生成值，再执行运算
        System.out.println("i = " + i);//i = 1
	}
	
	@Test
	public void testNumInt2(){
		int i = 1;
        System.out.println("i = " + i);
        System.out.println("i++ = " + i++);
        System.out.println("++i = " + ++i);
        System.out.println("i = " + i);

	}
	
	//左右 移位
	@Test
	public void testNumZUOYOU() {
		//　在数字没有溢出的前提下，对于正数和负数，
		//左移一位都相当于乘以2的1次方，左移n位就相当于乘以2的n次方
		int i = 2;//10,10000 2* 2的3次方
		System.out.println(Integer.toBinaryString(i));
		i = i<<3;
		System.out.println(i);
		System.out.println(Integer.toBinaryString(i));
		System.out.println("----------------------------");
		//右移的规则只记住一点：符号位不变，左边补上符号位
		//　按二进制形式把所有的数字向右移动对应的位数，低位移出(舍弃)，
		//高位的空位补符号位，即正数补零，负数补1
		//　右移一位相当于除2，右移n位相当于除以2的n次方。
		int j = 16;//10000,00010
		System.out.println(Integer.toBinaryString(j));
		j = j>>3;
		System.out.println(j);//2
		System.out.println(Integer.toBinaryString(j));
		System.out.println("----------------------------");
		int z = -16;//10000,00010
		System.out.println(Integer.toBinaryString(z));
		z = z>>3;
		System.out.println(z);//-2
		System.out.println(Integer.toBinaryString(z));
		
		System.out.println(Integer.toBinaryString(z).length());

		System.out.println("----------------------------");
		//无符号右移运算符>>>
		int q = 16;
		q = q>>>2;
		System.out.println(q);
		System.out.println(Integer.toBinaryString(q));
		System.out.println("----------------------------");
		//无符号右移运算符>>>
		int w = -16;
		w = w>>>2;
		System.out.println(w);//1073741820
		System.out.println(Integer.toBinaryString(w));
//111111111111111111111111111100
		
		System.out.println(Integer.toBinaryString(-128));//10000000
		System.out.println(Integer.toBinaryString(127)); //01111111

	}
}
