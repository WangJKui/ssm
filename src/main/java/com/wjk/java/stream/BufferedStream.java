package com.wjk.java.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/**
 * 字节缓冲流
 * @author h
 *
 */
public class BufferedStream {


	@Test
	public void testBufferedStream() throws IOException {
		/**
		 * 将 a.txt 文件 复制到 b.txt 中
		 */
		//字节缓冲输入流
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream("E:"+File.separator+"download"+File.separator+"input.txt"));		
		//字节缓冲输出流
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("E:"+File.separator+"download"+File.separator+"output.txt"));
		//定义一个字节数组，用来存储数据
		byte[] buffer = new byte[1024];
		int len = -1;//定义一个整数，表示读取的字节数
		while((len=bis.read(buffer))!=-1){
			System.out.println(new String(buffer,0,len));
			bos.write("qwe".getBytes());
			bos.write(buffer,0,len);
		}
		//关闭流资源
		bis.close();
        bos.close();
	}


}
