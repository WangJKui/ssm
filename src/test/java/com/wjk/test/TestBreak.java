package com.wjk.test;

import org.junit.Test;

public class TestBreak {

	@Test
	public void testWhile() {
		int i = 0;
		while(i<=3) {
			i++;
			System.out.println("i="+i);
		}
		System.out.println("------------------------");

		/**
		 * j=1
			j=2
		 */
		int j = 0;
		while(j<=3) {
			if(j==2)
				break;//跳出循环
			j++;
			System.out.println("j="+j);
		}
		System.out.println("------------------------");

		/*	continue z++在continue后面  在while 中 会死循环
		 *  在if 前面不会
		int z = 0;
		while(z<=3) {
			if(z==2)
				continue;//跳出循环
			z++;
			System.out.println("z="+z);
		}
		System.out.println("------------------------");
		 */
		/**
		 * k=0
			k=1
			k=3
		 */
		for (int k = 0; k < 4; k++) {
			if(k==2)
				continue;//跳出本次循环
			System.out.println("k="+k);
		}
		System.out.println("------------------------");

		int q = 0;
		outer://标签
			while(q<=4) {
				while(q<=3) {
					if(q==2)
						break outer;//跳出多层循环,终止循环，
					//continue outer; 跳出多层循环,再次从外部循环开始
					q++;
					System.out.println("w"+q);
				}
				q++;
				System.out.println("qqq"+q);

			}
		System.out.println("------------------------");

		/**
		 * k卡=0
			k卡=1
		 */
		/*for (int k = 0; k < 4; k++) {
			if(k==2)
				return;//跳出循环,结束当前方法 不在执行 qw
			System.out.println("k卡="+k);
		}
		 */System.out.println("------------------------");

		 int qw = 0;
		 for (; qw <= 3; ) {
			 qw++;
			 System.out.println("qw="+qw);
		 }
	}
	@Test
	public void testWhileC() {
		/**
		 * z=1
			z=3
			z=4
		 */
		int z = 0;
		while(z<=3) {
			z++;
			if(z==2)
				continue;//跳出循环
			System.out.println("z="+z);
		}
		System.out.println("------------------------");
	}

	@Test
	public void testWhileR() {
		/**
		 * z=1
		 */
		int z = 0;
		while(z<=3) {
			z++;
			if(z==2)
				return;//返回，终止方法
			System.out.println("z="+z);
		}
		System.out.println("------------------------");
	}

	@Test
	public void testForB() {
		for (int i = 0; i < 3; i++) {
			System.out.println("i="+i);
			for (int j = 0; j < 3; j++) {
				if(j==1) {
					break;
				}
				System.out.println("j="+j);
			}
		}
	}
}
