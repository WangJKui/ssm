package com.wjk.java.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

/**
 * 字节流
 * @author h
 *
 */
public class FileStream {
	
	@Test
	public void testFileStream() throws IOException {
		/**
		 * 将 a.txt 文件 复制到 b.txt 中
		 */
		//1、创建源和目标
		File inputFile = new File("E:"+File.separator+"download"+File.separator+"input.txt");
		File outputFile = new File("E:"+File.separator+"download"+File.separator+"output.txt");
		//2、创建输入输出流对象
		InputStream in = new FileInputStream(inputFile);
		OutputStream out = new FileOutputStream(outputFile);
		//3、读取和写入操作
		byte[] buffer = new byte[1024];//创建一个容量为 10 的字节数组，存储已经读取的数据
		int len = -1;//表示已经读取了多少个字节，如果是 -1，表示已经读取到文件的末尾
		while((len=in.read(buffer))!=-1){
			//打印读取的数据
			System.out.println(new String(buffer,0,len));
			//将 buffer 数组中从 0 开始，长度为 len 的数据读取到 b.txt 文件中
			out.write(buffer, 0, len);
		}
		//4、关闭流资源 关闭流的注意 先打开的后关  
		out.close();
		in.close();
	}
	
}
